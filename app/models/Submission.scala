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

  def generateDestinationExecutionScript(sourceDirectoryFiles: String,
    outputFile: String  ) = {
    // New print writer
    val fw = new PrintWriter(outputFile)

    fw.write("# Print user name, hostname and date")
    fw.write("\n")
    fw.write("echo \"$USER@`hostname` interface.sh `date`\"")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Get source directory/files")
    fw.write("\n")
    fw.write("sourceDirectoryFiles=\"" + sourceDirectoryFiles + "\"")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Get destination username and host")
    fw.write("\n")
    fw.write("destinationUsername=$1")
    fw.write("\n")
    fw.write("destinationHost=$2")
    fw.write("\n")
    fw.write("destinationUsernameAndHost=\"$destinationUsername@$destinationHost\"")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Get destination password")
    fw.write("\n")
    fw.write("destinationPassword=$3")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Get destination directory/files")
    fw.write("\n")
    fw.write("destinationDirectoryFiles=$4")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Get result files")
    fw.write("\n")
    fw.write("resultDirectoryFiles=$5")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Start time in second")
    fw.write("\n")
    fw.write("START=$(date +%s.%N)")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Send source directory/files to destination directory/files using scp")
    fw.write("\n")
    fw.write("echo \"$destinationPassword\" | ./sshaskpass.sh scp -r \"$sourceDirectoryFiles\" \"$destinationUsername@$destinationHost:/$destinationDirectoryFiles\"")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Go to the source directory/files")
    fw.write("\n")
    fw.write("goToSourceDirectory=\"$sourceDirectoryFiles\"")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Login destination go to the source directory and execute execution script")
    fw.write("\n")
    fw.write("echo \"$destinationPassword\" | ./sshaskpass.sh ssh $destinationUsernameAndHost \"cd $sourceDirectoryFiles; ./execution.sh;\"")
    fw.write("\n")
    fw.write("\n")

    fw.write("# If the execution is successful")
    fw.write("\n")
    fw.write("if [ $? -eq 0 ]; then")
    fw.write("\n")
    fw.write("\t# Send resultDirectoryFiles from destination back to source directory/files using scp")
    fw.write("\n")
    fw.write("\techo \"$destinationPassword\" | ./sshaskpass.sh scp -r \"$destinationUsername@$destinationHost:/$destinationDirectoryFiles/$sourceDirectoryFiles/$resultDirectoryFiles\" \"$PWD\"")
    fw.write("\n")
    fw.write("\n")

    fw.write("\t# End time in second")
    fw.write("\n")
    fw.write("\tEND=$(date +%s.%N)")
    fw.write("\n")
    fw.write("\n")

    fw.write("\t# Print execution time")
    fw.write("\n")
    fw.write("\tDIFF=$(echo \"$END - $START\" | bc)")
    fw.write("\n")
    fw.write("\techo \"$DIFF seconds\"")
    fw.write("\n")
    fw.write("else")
    fw.write("\n")
    fw.write("\t# End time in second")
    fw.write("\n")
    fw.write("\tEND=$(date +%s.%N)")
    fw.write("\n")
    fw.write("\n")

    fw.write("\t# Print execution time")
    fw.write("\n")
    fw.write("\tDIFF=$(echo \"$END - $START\" | bc)")
    fw.write("\n")
    fw.write("\techo \"$DIFF seconds\"")
    fw.write("\n")
    fw.write("fi")
    fw.write("\n")
    fw.write("\n")

    fw.write("# Login destination and remove the directory")
    fw.write("\n")
    fw.write("echo \"$destinationPassword\" | ./sshaskpass.sh ssh $destinationUsernameAndHost \"rm -r $sourceDirectoryFiles\"")
    fw.write("\n")
    fw.write("\n")

    // Close file
    fw.close()
  }
}