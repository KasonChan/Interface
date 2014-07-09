package controllers

import play.api._
import play.api.mvc._

import models.User

object Application extends Controller {
  // Homepage
  def index = Action {
    val emptyUser = User("", "", "", "")
    Ok(views.html.index(List(""))(emptyUser))
  }

  // Signup page
  def signup = Action {
    val emptyUser = User("", "", "", "")
    Ok(views.html.signup(List(""))(emptyUser))
  }

  // Guest page
  def guest = Action {
    Ok(views.html.guest())
  }

  // Test page
  def test = Action {
    Ok(views.html.test())
  }

  // Destination page
  def destination = Action {
    Ok(views.html.destination())
  }
}