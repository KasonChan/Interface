package models

import java.util.Scanner
import java.io._

import play.api._
import play.api.mvc._
import play.api.data.Form
import play.api.data.Forms._
import play.api.i18n.Messages
import play.mvc.Http.MultipartFormData
import play.mvc.Http.MultipartFormData._

// import models.Destination
// import models.File
// import models.OS
// import models.Submission
// import models.User

object Submission {
  def generateSubmissionScript(outputFile: String) = {
    // New print writer
    val fw = new PrintWriter(outputFile)

    // Write content to output file
    fw.write("echo \"*****START ./interface.sh\"")
    fw.write("\n")

    fw.write("cd $1")
    fw.write("\n")

    fw.write("./interface.sh $2 $3 $4 $5")
    fw.write("\n")

    fw.write("echo \"*****END ./interface.sh")
    fw.write("\n")

    // Close file
    fw.close()
  }
}