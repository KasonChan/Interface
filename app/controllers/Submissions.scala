package controllers

import java.io._

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

import models.Command.Linux
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
      val destinationDirectory = "home" + "/" + username

      /**
       * Local variables declarations
       */
      // Get current user information
      val user = User.get(username)

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
          f.ref.moveTo(new java.io.File(localSubmissionComposition + "/" + f.filename),
            true)
        })

        val filesUploadMsg = "File(s) is/are uploaded: " + "\n" + fn

        // Get data from the form
        def data = request.body.asFormUrlEncoded
        // Get selected confirguation
        def configuration = data.get("configuration")

        /**
         * Check OS
         */
        OS.getName match {
          /**
           * Linux
           */
          case "Linux" => {
            configuration match {
              case Some(Seq("local")) => {
                /**
                 * Generate script files for executing the submission
                 */
                // Interface execution script name
                val executionScriptName = localSubmissionComposition + "/" + "interface.sh"

                // Generate execution script 
                Submission.generateInterfaceScript1(compositionsDirectory,
                  executionScriptName)

                // Submission script name
                val submissionScriptName = localSubmissionComposition + "/" + "submissionExecution.sh"

                // Generate submission execution script
                Submission.generateSubmissionScript1(submissionScriptName)

                /**
                 * Chmod the script files
                 */
                val chmodOption = "u+x"
                val fileOption = ".sh"

                // Chmod the scripts in the composition directory
                val compositionScripts = Linux.ls(localSubmissionComposition)
                Linux.chmod(chmodOption)(compositionScripts)(fileOption)(localSubmissionComposition)

                /**
                 * Execute the submission scripts
                 */
                val sh =
                  Linux.sh(submissionScriptName)(localSubmissionComposition)(localSubmissionComposition)

                // Get the list of the outputs as string
                val outputs = Linux.lsStartsWithOpts("output")(localSubmissionComposition)

                var errors = List("")

                if (outputs == "") {
                  errors = List(Messages("submission.error.external"))
                }

                var results = List(File("", ""))

                if (outputs != "") {
                  // Get the list of outputs as array of string
                  val filesArray = outputs.split("\n")

                  if (filesArray != "") {
                    if (filesArray.length >= 4) {
                      for (file <- filesArray) {
                        val result = File(file, Linux.cat(file)(localSubmissionComposition))
                        results = results :+ result
                      }

                      results = results.tail
                    } else {
                      errors = List(Messages("submission.error.external"))
                    }
                  }
                }

                // Display result after submission and execution
                Ok(views.html.execution(List(filesUploadMsg))(errors)(user)(results))

              } // End of configuration case local

              // Configuration case dagman
              case Some(Seq("dagman")) => {

                // Get user destination information
                val destination = Destination.getWithType(username)(Messages("destination.label.type.dagman"))

                /**
                 * Generate script files for executing the submission
                 */
                // Submission script name
                val submissionScriptName = localSubmissionDirectory + "submissionExecution.sh"

                // Generate submission execution script
                Submission.generateSubmissionScript3(submissionScriptName)

                // Interface execution script name
                val executionScriptName = localSubmissionDirectory + "interface.sh"

                // Generate execution script 
                Submission.generateInterfaceScript3(compositionsDirectory,
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
                val compositionScripts = Linux.ls(localSubmissionComposition)
                Linux.chmod(chmodOption)(compositionScripts)(fileOption)(localSubmissionComposition)

                // Chmod the scripts in the submission directory
                val submissionScripts = Linux.ls(localSubmissionDirectory)
                Linux.chmod(chmodOption)(submissionScripts)(fileOption)(localSubmissionDirectory)

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
                val sh =
                  Linux.sh(submissionScriptName)(localSubmissionDirectory + " " +
                    destination(0).destinationUsername + " " +
                    destination(0).destinationHostname + " " +
                    destination(0).destinationPassword + " " +
                    "home/" + destination(0).destinationUsername + " " +
                    "")(localSubmissionDirectory)

                // Get the list of the outputs as string
                val outputs = Linux.lsStartsWithOpts("output")(localSubmissionComposition)

                var errors = List("")

                if (outputs == "") {
                  errors = List(Messages("submission.error.external"))
                }

                var results = List(File("", ""))

                if (outputs != "") {
                  // Get the list of outputs as array of string
                  val filesArray = outputs.split("\n")

                  if (filesArray != "") {
                    if (filesArray.length >= 4) {
                      for (file <- filesArray) {
                        val result = File(file, Linux.cat(file)(localSubmissionComposition))
                        results = results :+ result
                      }

                      results = results.tail
                    } else {
                      errors = List(Messages("submission.error.external"))
                    }
                  }
                }
                // Display result after submission and execution
                Ok(views.html.execution(List(filesUploadMsg))(errors)(user)(results))

              } // End of configuration case dagman

              // Configuration case local+cluster
              case Some(Seq("local+cluster")) => {

                // Get user destination information
                val destination = Destination.getWithType(username)(Messages("destination.label.type.cluster"))

                /**
                 * Generate script files for executing the submission
                 */
                // Submission script name
                val submissionScriptName = localSubmissionDirectory + "submissionExecution.sh"

                // Generate submission execution script
                Submission.generateSubmissionScript4(submissionScriptName)

                // Interface execution script name
                val executionScriptName = localSubmissionDirectory + "interface.sh"

                // Generate execution script 
                Submission.generateInterfaceScript4(compositionsDirectory,
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
                val compositionScripts = Linux.ls(localSubmissionComposition)
                Linux.chmod(chmodOption)(compositionScripts)(fileOption)(localSubmissionComposition)

                // Chmod the scripts in the submission directory
                val submissionScripts = Linux.ls(localSubmissionDirectory)
                Linux.chmod(chmodOption)(submissionScripts)(fileOption)(localSubmissionDirectory)

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
                val sh =
                  Linux.sh(submissionScriptName)(localSubmissionComposition + " " +
                    destination(0).destinationUsername + " " +
                    destination(0).destinationHostname + " " +
                    destination(0).destinationPassword + " " +
                    "home/" + destination(0).destinationUsername + " " +
                    "")(localSubmissionDirectory)

                // Get the list of the outputs as string
                val outputs = Linux.lsStartsWithOpts("output")(localSubmissionComposition)

                var errors = List("")

                if (outputs == "") {
                  errors = List(Messages("submission.error.external"))
                }

                var results = List(File("", ""))

                if (outputs != "") {
                  // Get the list of outputs as array of string
                  val filesArray = outputs.split("\n")

                  if (filesArray != "") {
                    if (filesArray.length >= 4) {
                      for (file <- filesArray) {
                        val result = File(file, Linux.cat(file)(localSubmissionComposition))
                        results = results :+ result
                      }

                      results = results.tail

                    } else {
                      errors = List(Messages("submission.error.external"))
                    }
                  }
                }

                // Display result after submission and execution
                Ok(views.html.execution(List(filesUploadMsg))(errors)(user)(results))
              } // End of configuration case local+dagman

              // Configuration case local+dagman
              case Some(Seq("local+dagman")) => {

                // Get user destination information
                val destination = Destination.getWithType(username)(Messages("destination.label.type.dagman"))

                /**
                 * Generate script files for executing the submission
                 */
                // Submission script name
                val submissionScriptName = localSubmissionDirectory + "submissionExecution.sh"

                // Generate submission execution script
                Submission.generateSubmissionScript5(submissionScriptName)

                // Interface execution script name
                val executionScriptName = localSubmissionDirectory + "interface.sh"

                // Generate execution script 
                Submission.generateInterfaceScript5(compositionsDirectory,
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
                val compositionScripts = Linux.ls(localSubmissionComposition)
                Linux.chmod(chmodOption)(compositionScripts)(fileOption)(localSubmissionComposition)

                // Chmod the scripts in the submission directory
                val submissionScripts = Linux.ls(localSubmissionDirectory)
                Linux.chmod(chmodOption)(submissionScripts)(fileOption)(localSubmissionDirectory)

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
                val sh =
                  Linux.sh(submissionScriptName)(localSubmissionComposition + " " +
                    destination(0).destinationUsername + " " +
                    destination(0).destinationHostname + " " +
                    destination(0).destinationPassword + " " +
                    "home/" + destination(0).destinationUsername + " " +
                    "")(localSubmissionDirectory)

                // Get the list of the outputs as string
                val outputs = Linux.lsStartsWithOpts("output")(localSubmissionComposition)

                var errors = List("")

                if (outputs == "") {
                  errors = List(Messages("submission.error.external"))
                }

                var results = List(File("", ""))

                if (outputs != "") {
                  // Get the list of outputs as array of string
                  val filesArray = outputs.split("\n")

                  if (filesArray != "") {
                    if (filesArray.length >= 4) {
                      for (file <- filesArray) {
                        val result = File(file, Linux.cat(file)(localSubmissionComposition))
                        results = results :+ result
                      }

                      results = results.tail
                    } else {
                      errors = List(Messages("submission.error.external"))
                    }
                  }
                }

                // Display result after submission and execution
                Ok(views.html.execution(List(filesUploadMsg))(errors)(user)(results))
              } // End of configuration case local+dagman

            } // End of configuration match
          } // End of case Linux
        } // End of OS match
      } catch {
        case e: Throwable => Ok(views.html.errors(e))
      }
    }.getOrElse {
      Ok(views.html.notAuthorized(User.emptyMessages)(List(Messages("not.authorized.not.connected"))))
    }
  }
}