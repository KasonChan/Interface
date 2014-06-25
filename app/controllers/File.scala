package controllers

import play.api._
import play.api.mvc._
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import java.io._

object File extends Controller {
  // Uploads all files into compositions folder and writes to source
  def upload = Action(parse.temporaryFile) { request =>
    request.body.moveTo(new File("compositions/source"), true)
    Ok("File uploaded")
  }

  // TODO: Fix this upload function to accomodate multiple files uploads 
  // def upload = Action(parse.multipartFormData) { request =>
  //   request.body.file("files").map { source =>
  //     val filename = source.filename
  //     val contentType = source.contentType.get
  //     source.ref.moveTo(new File("~/compositions/" + source.filename))
  //   }.getOrElse {
  //     Redirect(routes.Application.index)
  //   }
  //   Ok("Files have been uploaded")
  // }

  // public static void overviewsubmit(File fake) {
  //     List<Upload> files = (List<Upload>) request.args.get("__UPLOADS");
  //     for(Upload file: files) {
  //         Logger.info("Size = %d", file.getSize());
  //     }
  // }

  // def upload = Action(parse.multipartFormData) { request =>
  //   for (file <- request.body.file("files")) { 
  //     val filename = file.filename
  //     val contentType = file.contentType.get
  //     file.ref.moveTo(new File("compositions/" + file.filename))
  //   }
  //   Ok("Files have been uploaded")
  // }
}

