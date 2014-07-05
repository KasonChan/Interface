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
  def signup = Action { request =>
    // Get user information from the form
    def firstname = request.body.asFormUrlEncoded.get("firstname")(0)
    def lastname = request.body.asFormUrlEncoded.get("lastname")(0)
    def username = request.body.asFormUrlEncoded.get("username")(0)
    def password = request.body.asFormUrlEncoded.get("password")(0)
    def passwordConfirmation = request.body.asFormUrlEncoded.get("passwordConfirmation")(0)

    //
    // TODO: Add validation
    // 

    // Insert user into the database
    val user = User(firstname, lastname, username, password)
    User.insert(user)
    
    // Redirect the page to list all the users
    Redirect(routes.Users.list)
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