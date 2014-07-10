package controllers

import play.api._
import play.api.mvc._

import models.User
import models.Destination

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
    val emptyDestination = Destination("", "", "", "")
    Ok(views.html.destination(List(""))(emptyDestination))
  }

  // Submission page
  def submission = Action {
    Ok(views.html.submission())
  }
}