package controllers

import play.api._
import play.api.mvc._
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import java.io._

object File extends Controller {
  // // TODO: Fix this upload function to accomodate multiple files uploads 
  // def upload = Action(parse.multipartFormData) { request =>
  //   Ok("File(s) is/are uploaded: " + "\n" + 
  //     request.body.file("files[]"))

  //   // Ok("File(s) is/are uploaded: " + "\n" + 
  //   //   request.body.files(0).filename + "\n" +
  //   //   request.body.files(1).filename + "\n" +
  //   //   request.body.files(2).filename)
  // }

  // // Uploads all files into compositions folder and writes to source
  // def upload = Action(parse.temporaryFile) { request =>
  //   request.body.moveTo(new File("guest/compositions/source"), true)
  //   Ok("File(s) is/are uploaded: " + request.body)
  // }

  // // TODO: Fix this upload function to accomodate multiple files uploads 
  // def upload = Action(parse.multipartFormData) { request =>
  //   request.body.file("files").map { source =>
  //     val filename = source.filename
  //     val contentType = source.contentType.get
  //     source.ref.moveTo(new File("guest/compositions/" + source.filename), true)
  //   }.getOrElse {
  //     Redirect(routes.Application.index)
  //   }
  //   Ok("File(s) is/are uploaded: " + request.body)
  // }

  // def upload = Action(parse.multipartFormData) { request =>
  //   var fn: String = "Testing "
  //   for (file <- request.body.file("files[]")) { 
  //     val filename = file.filename
  //     fn = fn + " " + filename.toString
  //     val contentType = file.contentType.get
  //     file.ref.moveTo(new File("guest/compositions/" + file.filename), true)
  //   }
  //   Ok("File(s) is/are uploaded: " + request.body + "\n<br>" +
  //     fn)
  // }

  def upload = Action(parse.multipartFormData) { request =>
    var fn: String = "Testing "
    request.body.files.foreach(f => {
      val filename = f.filename
      fn = fn + " " + filename.toString
      val contentType = f.contentType.get
      f.ref.moveTo(new File("guest/compositions/" + f.filename), true)
    })
    Ok("File(s) is/are uploaded: " + "\n" +
      request.body + "\n" +
      fn)
  }
}

