package controllers

import java.io._

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.Command
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

      /**
       * Destination variables declarations
       */
      // Destination directory
      // TODO:
      // Get from the database
      val destinationDirectory = "home" + "/" + username

      /**
       * Local variables declarations
       */
      // Get current user information
      val user = User.get(username)

      // Get user destination information
      val destination = Destination.get(username)

      // Composition directory
      val compositionsDirectory = "compositions"

      // Local user directory
      val localUserDirectory = "submissions" + "/" + username
      // Local submission number
      val localSubmissionNum = File.getSubmissionCount(localUserDirectory) + 1
      // Local submission directory
      // This is the directory to upload and execute codes for this session
      val localSubmissionDirectory = localUserDirectory + "/" + "submission" +
        localSubmissionNum + "/"

      // Local submission compositions
      val localSubmissionComposition = localSubmissionDirectory +
        compositionsDirectory

      /**
       * Upload files to the interface
       */
      try {
        // Upload and move the files to local user submission directory
        var fn: String = ""
        request.body.files.foreach(f => {
          val filename = f.filename
          fn = fn + "\n" + filename.toString
          val contentType = f.contentType.get
          f.ref.moveTo(new File(localSubmissionComposition + "/" + f.filename),
            true)
        })

        val filesUploadMsg = "File(s) is/are uploaded: " + "\n" + fn

        /**
         * Generate script files for executing the the submission
         */
        // Submission script name
        val submissionScriptName = localSubmissionDirectory + "submissionExecution.sh"

        // Generate submission execution script
        Submission.generateSubmissionScript(submissionScriptName)

        // Interface execution script name
        val executionScriptName = localSubmissionDirectory + "interface.sh"

        // Generate execution script 
        Submission.generateInterfaceScript(compositionsDirectory,
          executionScriptName)

        // sshaskpass script name
        val sshaskpassScriptName = localSubmissionDirectory + "sshaskpass.sh"

        // Generate sshaskpass script
        Submission.generateSshaskpassScript(sshaskpassScriptName)
        
        /**
         * Chmod the script files
         */
        val chmodOption = "u+x"
        val fileOption = ".sh"
        
        // Chmod the scripts in the composition directory
        val compositionScripts = Command.ls(localSubmissionComposition)
        Command.chmod(chmodOption)(compositionScripts)(fileOption)(localSubmissionComposition)

        // Chmod the scripts in the submission directory
        val submissionScripts = Command.ls(localSubmissionDirectory)
        Command.chmod(chmodOption)(submissionScripts)(fileOption)(localSubmissionDirectory)

        /**
         * Execute the submission scripts
         */
        // Execute interface
        // $2 destinationUsername
        // $3 destinationHostname
        // $4 destinationPassword
        // $5 destinationDirectoryFiles
        // $6 resultDirectoryFiles
        // Command sh
        Command.sh(submissionScriptName)(localSubmissionDirectory + " " + 
          destination(0).destinationUsername + " " +
          destination(0).destinationHostname + " " +
          destination(0).destinationPassword + " " +
          "home/" + destination(0).destinationUsername + " " +
          "outputD")(localSubmissionDirectory)

        val outputs = Command.lsWithOpts("output")(localSubmissionDirectory)

        // Display after submission and execution
        Ok(views.html.execution(List(filesUploadMsg, compositionScripts, 
          submissionScripts, outputs))(emptyErrors)(user))
      } catch {
        case e: Throwable => Ok(views.html.errors(e))
      }

    }.getOrElse {
      Ok(views.html.notAuthorized(User.emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }
}