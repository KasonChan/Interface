package controllers

import play.api._
import play.api.mvc._
import play.api.mvc.Flash
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.User

object Users extends Controller {
  def create = Action { request =>
    // Get user information from the form
    def firstname = request.body.asFormUrlEncoded.get("firstname")(0)
    def lastname = request.body.asFormUrlEncoded.get("lastname")(0)
    def username = request.body.asFormUrlEncoded.get("username")(0)
    def password = request.body.asFormUrlEncoded.get("password")(0)
    def passwordConfirmation = request.body.asFormUrlEncoded.get("passwordConfirmation")(0)

    val user = User.get(username)
    var errors = List("")

    // Check if the username is between 6 and 30 characters
    if ((username.length < 6) || (username.length > 30))
      errors = List(Messages("signup.error.username.length"))

    // Check if the username is existed in the database
    if (!user.isEmpty)
      errors = errors :+ Messages("signup.error.username.existed")

    // Check if the password length >= 8
    if ((password.length < 8))
      errors = errors :+ Messages("signup.error.password.length")

    // Check if the password confirmation is equaled to password
    if (passwordConfirmation != password)
      errors = errors :+ Messages("signup.error.passwordConfirmation")

    // If there is no errors
    if (errors == List("")) {
      val newUser = User(firstname, lastname, username, password)
      
      // Insert user into database
      User.insert(newUser)
      
      // Display destination
      // Store usename in session
      Ok(views.html.destination()).withSession(
        "connected" -> username)
    } else {
      val invalidUser = User(firstname, lastname, username, password)

      // Return to the form with error messages
      Ok(views.html.signup(errors)(invalidUser))
    }
  }

  def signin = Action { request =>
    // Get username and password from the form
    def username = request.body.asFormUrlEncoded.get("username")(0)
    def password = request.body.asFormUrlEncoded.get("password")(0)

    // Get user from database
    val user = User.get(username)

    // Check if the username not existed
    if (user.isEmpty) {
      val errors = List(Messages("signin.error"))
      val invalidUser = User("", "", username, password)

      // Return to the form with error message
      // Discard the whole session
      Ok(views.html.index(errors)(invalidUser))
    } // Check if the username and password is matching with the database
    else if ((user(0).username == username) && (user(0).password == password)) {
      // Display destination
      Ok(views.html.destination()).withSession(
        "connected" -> username)
    } else {
      val errors = List(Messages("signin.error"))
      val invalidUser = User("", "", username, password)

      // Return to the form with error messages
      // Discard the whole session
      Ok(views.html.index(errors)(invalidUser))
    }
  }

  def list = Action { implicit request =>
    // Get the list of users
    val users = User.getAll

    // Show the list of users information
    Ok(views.html.list(users))
  }

  def listUser(username: String) = Action { implicit request =>
    // Get user information from database
    val user = User.get(username)

    // Show the user information
    Ok(views.html.update(user))
  }

  def update(username: String) = Action { implicit request =>
    // Get user updated information from the form
    def firstname = request.body.asFormUrlEncoded.get("firstname")(0)
    def lastname = request.body.asFormUrlEncoded.get("lastname")(0)
    def username = request.body.asFormUrlEncoded.get("username")(0)
    def password = request.body.asFormUrlEncoded.get("password")(0)
    def passwordConfirmation = request.body.asFormUrlEncoded.get("passwordConfirmation")(0)

    // Update user into the database
    val updateUser = User(firstname, lastname, username, password)
    User.update(updateUser)

    // Redirect the page to show updated user information
    Redirect(routes.Users.listUser(username))
  }
}