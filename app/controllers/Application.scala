package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages

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
  def destination = Action { request =>
    request.session.get("connected").map { username =>
      val emptyDestination = Destination(username, "", "", "")
      Ok(views.html.destination(List(""))(User.get(username)(0))
        (emptyDestination))
    }.getOrElse {
      Ok(views.html.badRequest(Messages("bad.request.not.connected")))
    }
  }

  // Submission page
  def submission = Action { request =>
    request.session.get("connected").map { username =>
      Ok(views.html.submission(username))
    }.getOrElse {
      Ok(views.html.badRequest(Messages("bad.request.not.connected")))
    }
  }
}