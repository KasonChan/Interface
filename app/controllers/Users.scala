package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.Flash
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.Destination
import models.User

object Users extends Controller {
  // Empty list of messages
  val emptyMessages = List("")

  // Empty list of errors
  val emptyErrors = List("")

  // Empty user
  val emptyUser = User("", "", "", "")

  def create = Action { request =>
    // Get user information from the form
    def firstname = request.body.asFormUrlEncoded.get("firstname")(0)
    def lastname = request.body.asFormUrlEncoded.get("lastname")(0)
    def username = request.body.asFormUrlEncoded.get("username")(0)
    def password = request.body.asFormUrlEncoded.get("password")(0)
    def passwordConfirmation =
      request.body.asFormUrlEncoded.get("passwordConfirmation")(0)

    // Get the user information
    val user = User.get(username)
    var errors = List("")

    // Check if the username is between 7 and 35 characters
    if ((username.length < 7) || (username.length > 35))
      errors = List(Messages("signup.error.username.length"))

    // Check if the username is existed in the database
    if (user != User("", "", "", ""))
      errors = errors :+ Messages("signup.error.username.existed")

    // Check if the password length is between 8 and 35 characters
    if ((password.length < 8) || (password.length > 35))
      errors = errors :+ Messages("signup.error.password.length")

    // Check if the password confirmation is equaled to password
    if (passwordConfirmation != password)
      errors = errors :+ Messages("signup.error.passwordConfirmation")

    // If there is no errors in the list
    if (errors == emptyErrors) {
      val newUser = User(firstname, lastname, username, password)

      // Insert user into database
      User.insert(newUser)

      // Display destination
      // Store username as connected session data
      val emptyDestination = Destination(username, "", "", "")
      Ok(views.html.destination(emptyMessages)(emptyErrors)(newUser)(emptyDestination)).withSession(
        "connected" -> username)
    } else {
      val invalidUser = User(firstname, lastname, username, password)

      // Return to the form with error messages
      // Discard whole session
      Ok(views.html.signup(emptyMessages)(errors)(invalidUser)).withNewSession
    }
  }

  def signin = Action { request =>
    // Get username and password from the form
    def username = request.body.asFormUrlEncoded.get("username")(0)
    def password = request.body.asFormUrlEncoded.get("password")(0)

    // Get user from database
    val user = User.get(username)

    // Check if the username not existed
    if (user == User("", "", "", "")) {
      val errors = List(Messages("signin.error"))
      val invalidUser = User("", "", username, password)

      // Return to the form with error message
      // Discard the whole session
      Ok(views.html.signin(emptyMessages)(errors)(invalidUser)).withNewSession
    } // Check if the username and password is matching with the database
    else if ((user.username == username) && (user.password == password)) {
      // Display destination
      // Store username as connected session data

      Ok(views.html.submission(List(Messages("signin.success")))(emptyErrors)(user)).withSession(
        "connected" -> username)
    } else {
      val errors = List(Messages("signin.error"))
      val invalidUser = User("", "", username, password)

      // Return to the form with error messages
      // Discard the whole session
      Ok(views.html.signin(emptyMessages)(errors)(invalidUser)).withNewSession
    }
  }

  def logout = Action { request =>
    request.session.get("connected").map { username =>
      val emptyUser = User("", "", "", "")
      Ok(views.html.index(List(Messages("logout")))(emptyErrors)(emptyUser)).withNewSession
    }.getOrElse {
      val emptyUser = User("", "", "", "")
      Ok(views.html.index(emptyMessages)(emptyErrors)(emptyUser)).withNewSession
    }
  }

  def list = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get the list of users
      val users = User.getAll

      // Show the list of users information
      Ok(views.html.list(users))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }

  def listUser(username: String) = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get user information from database
      val user = User.get(username)

      var errors = List("")

      // Check if the username not existed
      if (user == User("", "", "", "")) {
        errors = List(Messages("update.error.not.existed"))
        Ok(views.html.updateUser(emptyMessages)(errors)(user))
      }

      // Show the user information
      Ok(views.html.updateUser(emptyMessages)(errors)(user))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }

  def edit(username: String, action: String) = Action { implicit request =>
    request.session.get("connected").map { username =>
      // Get user updated information from the form
      def firstname = request.body.asFormUrlEncoded.get("firstname")(0)
      def lastname = request.body.asFormUrlEncoded.get("lastname")(0)
      def password = request.body.asFormUrlEncoded.get("password")(0)

      var errors = List("")
      var messages = List("")

      // Check if the password length is between 8 and 35 characters
      if ((password.length < 8) || (password.length > 35))
        errors = errors :+ Messages("signup.error.password.length")

      // Update user
      val updateUser = User(firstname, lastname, username, password)

      // Invalid user
      val invalidUser = User(firstname, lastname, username, password)

      // If the action is update
      if (action == "updated")
        // If there is no errors in the list, redirect to submission
        if (errors == emptyErrors) {
          // Update user into the database
          User.update(updateUser)
          
          // Display updated message
          messages = List(Messages("update.success"))
        }

      Ok(views.html.updateUser(messages)(errors)(invalidUser))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }
}