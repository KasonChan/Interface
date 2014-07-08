package controllers

import play.api._
import play.api.mvc._
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import java.io._

import models.OS

object Files extends Controller {
  val id = OS.getID
  
  // Uploads all files into compositions folder and writes to source
  def uploadTest = Action(parse.temporaryFile) { request =>
    request.body.moveTo(new File("guest/" + id + "/compositions"), true)
    Ok("File uploaded")
  }

  // 
  // TODO: 
  // Change page layout
  // Create directory for user auth
  // 
  def upload = Action(parse.multipartFormData) { request =>
    var fn: String = ""
    request.body.files.foreach(f => {
      val filename = f.filename
      fn = fn + "\n" + filename.toString
      val contentType = f.contentType.get
      f.ref.moveTo(new File("guest/" + id + "/compositions/" + f.filename), true)
    })
    Ok("File(s) is/are uploaded: " + "\n" + fn)
  }
}

