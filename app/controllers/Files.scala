package controllers

import java.io._

import play.api._
import play.api.mvc._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.File
import models.OS
import models.User

object Files extends Controller {
  val id = OS.getID

  // Uploads all files into compositions folder and writes to source
  def uploadTest = Action(parse.temporaryFile) { request =>
    request.body.moveTo(new File("guest/" + id + "/compositions"), true)
    Ok("File uploaded")
  }

  def uploadCompositions = Action(parse.multipartFormData) { request =>
    request.session.get("connected").map { username =>

      val userDirectory = "submissions/" + username
      val userDirectoryNewNumber = File.getSubmissionCount(userDirectory) + 1

      var fn: String = ""
      request.body.files.foreach(f => {
        val filename = f.filename
        fn = fn + "\n" + filename.toString
        val contentType = f.contentType.get
        f.ref.moveTo(new File(userDirectory + "/submission" +
          userDirectoryNewNumber + "/compositions/" + f.filename), true)
      })

      Ok("File(s) is/are uploaded: " + "\n" + fn)
    }.getOrElse {
      Ok(views.html.notAuthorized(User.emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }
}

