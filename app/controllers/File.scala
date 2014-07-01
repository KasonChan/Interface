package controllers

import play.api._
import play.api.mvc._
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import java.io._

object File extends Controller {
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
      f.ref.moveTo(new File("guest/compositions/" + f.filename), true)
    })
    Ok("File(s) is/are uploaded: " + "\n" + fn)
  }
}

