package controllers

import play.api._
import play.api.mvc._
import play.api.i18n.Messages

import models.User
import models.Destination

object Application extends Controller {
  // Empty list of messages
  val emptyMessages = List("")

  // Empty list of errors
  val emptyErrors = List("")

  // Empty user
  val emptyUser = User("", "", "", "")

  // Homepage
  // Redirect to submission if connected
  // Otherwise display empty sign in page
  def index = Action { request =>
    request.session.get("connected").map { username =>
    // Get the user information
    val user = User.get(username)

    Ok(views.html.submission(emptyMessages)(emptyErrors)(user))
        
    }.getOrElse {
      Ok(views.html.signin(emptyMessages)(emptyErrors)(emptyUser)).withNewSession
    }
  }

  def signin = Action { request =>
    request.session.get("connected").map { username =>
      Ok(views.html.signin(emptyMessages)(emptyErrors)(emptyUser)).withNewSession  
    }.getOrElse {
      Ok(views.html.signin(emptyMessages)(emptyErrors)(emptyUser)).withNewSession
    }
  }

  // Signup page
  // Display empty sign up page
  def signup = Action {
    Ok(views.html.signup(emptyMessages)(emptyErrors)(emptyUser))
  }

  // Destination page
  // Display empty destination if connected
  // Otherwise, display not authorized error message
  def destination = Action { request =>
    request.session.get("connected").map { username =>
      // Get the user information
      val user = User.get(username)

      // Create empty destination of the username
      val emptyDestination = Destination(username, "", "", "")
      Ok(views.html.destination(emptyMessages)(emptyErrors)(user)(emptyDestination))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }

  // Submission page
  // Display submission page if connected
  // Otherwise, display not authorized error message
  def submission = Action { request =>
    request.session.get("connected").map { username =>
      // Get the user information
      val user = User.get(username)

      Ok(views.html.submission(emptyMessages)(emptyErrors)(user))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }
}