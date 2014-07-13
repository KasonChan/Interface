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
import models.Destination

object Submissions extends Controller {
  // Empty list of messages
  val emptyMessages = List("")

  // Empty list of errors
  val emptyErrors = List("")

  def submit(messages: List[String]) = Action { request =>
    request.session.get("connected").map { username =>
      val user = User.get(username)
      Ok(views.html.submission(messages)(emptyErrors)(user))
    }.getOrElse {
      Ok(views.html.notAuthorized(emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }
}