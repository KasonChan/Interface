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

import sys.process._
import language.postfixOps

object Submission {
  def generateSubmissionScript(outputFile: String) = {
    // New print writer
    val fw = new PrintWriter(outputFile)

    // Execute interface
    // $2 destinationUsername
    // $3 destinationHostname
    // $4 destinationPassword
    // $5 destinationDirectoryFiles
    // $6 resultDirectoryFiles

    // Write content to output file
    fw.write("""echo *****START ./interface.sh

cd $1
./interface.sh $2 $3 $4 $5 $6

if [ $? -eq 0 ]; then
  echo "Execution was successful"
else
  echo "Execution was not successful"
fi

echo *****END ./interface.sh
""")

    // Close file
    fw.close()
  }

  def generateInterfaceScript(sourceDirectoryFiles: String,
    outputFile: String) = {
    // New print writer
    val fw = new PrintWriter(outputFile)

    fw.write("""# Print user name, hostname and date
echo "$USER@`hostname` interface.sh `date`"

# Get source directory/files
sourceDirectoryFiles="compositions"

# Get destination username and host
destinationUsername=$1
destinationHost=$2
destinationUsernameAndHost="$destinationUsername@$destinationHost"

# Get destination password
destinationPassword=$3

# Get destination directory/files
destinationDirectoryFiles=$4

# Get result files
resultDirectoryFiles=$5

# Start time in second
START=$(date +%s.%N)

# Send source directory/files to destination directory/files using scp
echo "$destinationPassword" | ./sshaskpass.sh scp -r "$sourceDirectoryFiles" "$destinationUsername@$destinationHost:/$destinationDirectoryFiles"

# Go to the source directory/files
goToSourceDirectory="$sourceDirectoryFiles"

# Login destination go to the source directory and execute execution script
echo "$destinationPassword" | ./sshaskpass.sh ssh $destinationUsernameAndHost "cd $sourceDirectoryFiles; ./execution.sh;"

# If the execution is successful
if [ $? -eq 0 ]; then
  # Send resultDirectoryFiles from destination back to source directory/files using scp
  echo "$destinationPassword" | ./sshaskpass.sh scp -r "$destinationUsername@$destinationHost:/$destinationDirectoryFiles/$sourceDirectoryFiles/$resultDirectoryFiles" "$PWD"

  # End time in second
  END=$(date +%s.%N)

  # Print execution time
  DIFF=$(echo "$END - $START" | bc)
  echo "Execution was successful"
  echo "$DIFF seconds"
else
  # End time in second
  END=$(date +%s.%N)

  # Print execution time
  DIFF=$(echo "$END - $START" | bc)
  echo "Execution was not successful"
  echo "$DIFF seconds"
fi

# Login destination and remove the directory
echo "$destinationPassword" | ./sshaskpass.sh ssh $destinationUsernameAndHost "rm -r $sourceDirectoryFiles"
""")

    // Close file
    fw.close()
  }

  def generateSshaskpassScript(outputFile: String) = {
    // New print writer
    val fw = new PrintWriter(outputFile)

    fw.write("""#!/bin/bash
# 
# script that passes password from stdin to ssh. 
# 
# Copyright (C) 2010 André Frimberger <andre OBVIOUS_SIGN frimberger.de>
#
# This program is free software: you can redistribute it and/or modify
# it under the terms of the GNU General Public License as published by
# the Free Software Foundation, either version 3 of the License, or 
# (at your option) any later version.
#
# This program is distributed in the hope that it will be useful,
# but WITHOUT ANY WARRANTY; without even the implied warranty of
# MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
# GNU General Public License for more details.
#
# You should have received a copy of the GNU General Public License
# along with this program.  If not, see <http://www.gnu.org/licenses/>.
#
 
if [ -n "$SSH_ASKPASS_TMPFILE" ]; then
  cat "$SSH_ASKPASS_TMPFILE"
  exit 0
elif [ $# -lt 1 ]; then
  echo "Usage: echo password | $0 <ssh command line options>" >&2
  exit 1
fi
 
sighandler() {
  rm "$TMP_PWD"
}
 
TMP_PWD=$(mktemp)
chmod 600 "$TMP_PWD"
trap 'sighandler' SIGHUP SIGINT SIGQUIT SIGABRT SIGKILL SIGALRM SIGTERM
 
export SSH_ASKPASS=$0
export SSH_ASKPASS_TMPFILE=$TMP_PWD
 
[ "$DISPLAY" ] || export DISPLAY=dummydisplay:0
read password
echo $password >> "$TMP_PWD"
 
# use setsid to detach from tty
exec setsid "$@"
 
rm "$TMP_PWD"
""")

    // Close file
    fw.close()
  }
}