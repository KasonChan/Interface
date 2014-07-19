package controllers

import java.io._

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.Destination
import models.File
import models.OS
import models.Submission
import models.User

import sys.process._
import language.postfixOps

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

  def submission = Action(parse.multipartFormData) { request =>
    request.session.get("connected").map { username =>

      val user = User.get(username)

      val localUserDirectory = "submissions" + "/" + username
      val localSubmissionNewNumber = File.getSubmissionCount(localUserDirectory) + 1

      // Destination directory
      val destinationDirectory = "home" + "/" + username
      // Composition directory
      val compositionsDirectory = "compositions"

      // Local submission directory
      val localSubmissionDirectory = localUserDirectory + "/" + "submission" +
        localSubmissionNewNumber + "/"
      // Local submission compositions directory
      val localSubmissionComposition = localSubmissionDirectory +
        compositionsDirectory

      try {
        // Print list
        // Upload and move the files to corresponding directory
        var fn: String = ""
        request.body.files.foreach(f => {
          val filename = f.filename
          fn = fn + "\n" + filename.toString
          val contentType = f.contentType.get
          f.ref.moveTo(new File(localSubmissionComposition + "/" + f.filename), 
            true)
        })

        val filesUploadMsg = "File(s) is/are uploaded: " + "\n" + fn

        // Submission script name
        val submissionScriptName = localSubmissionDirectory + "submissionExecution.sh"

        // Generate submission execution script
        Submission.generateSubmissionScript(submissionScriptName)

        // Execution script name
        // Interface
        val executionScriptName = localSubmissionDirectory + "interface.sh"

        // Generate execution script 
        Submission.generateDestinationExecutionScript(compositionsDirectory,
          executionScriptName)

        val list = ("ls -als" !!)

        // Display after submission and execution
        Ok(views.html.execution(List(filesUploadMsg, list))(emptyErrors)(user))
      } catch {
        case e: Throwable => Ok(views.html.errors(e))
      }

    }.getOrElse {
      Ok(views.html.notAuthorized(User.emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }
}