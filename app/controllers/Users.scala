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
  // Signup form fields and constraints validation
  def signup = Action { request =>
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
    Redirect(routes.Users.list)
  }

  def list = Action { implicit request =>
    val users = User.getAll
    Ok(views.html.list(users))
  }

  // TODO: Fix update page
  def update(username: String) = Action { implicit request =>
    val users = User.getAll
    Ok(views.html.update(users))
  }
}