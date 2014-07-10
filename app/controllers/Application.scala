package controllers

import play.api._
import play.api.mvc._

import models.User
import models.Destination

object Application extends Controller {
  // Homepage
  def index = Action { request =>
    request.session.get("connected").map { username =>
      Redirect(routes.Submissions.submit)
    }.getOrElse {
      val emptyUser = User("", "", "", "")
      Ok(views.html.index(List(""))(emptyUser))
    }
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
  def submission = Action { request =>
    request.session.get("connected").map { username =>
      Ok(views.html.submission(username))
    }.getOrElse {
      Ok(views.html.badRequest("Oops, you are connected"))
    }
  }
}