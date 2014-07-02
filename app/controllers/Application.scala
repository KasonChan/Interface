package controllers

import play.api._
import play.api.mvc._

object Application extends Controller {

  // Homepage
  def index = Action {
    Ok(views.html.index())
  }

  // Signup page
  def signup = Action {
    Ok(views.html.signup())
  }

  // Guest page
  def guest = Action {
    Ok(views.html.guest())
  }

  // Test page
  def test = Action {
    Ok(views.html.test("None"))
  }
}