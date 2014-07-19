package controllers

import java.io._

import play.api._
import play.api.mvc._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.Destination
import models.File
import models.OS
import models.User

object Terminal extends Controller {
  val id = OS.getID

  // Empty list of errors
  val emptyErrors = List("")

  // // Uploads all files into compositions folder and writes to source
  // def uploadTest = Action(parse.temporaryFile) { request =>
  //   request.body.moveTo(new File("guest/" + id + "/compositions"), true)
  //   Ok("File uploaded")
  // }
}

