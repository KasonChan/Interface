package models

import java.io._

object File {
  // Get the total number of submissions
  def getSubmissionCount(directory: String) = {
    var count = 0
    val files = (new java.io.File(directory)).listFiles
    if (files != null) {
      for (file <- files if file.getName.startsWith("submission")) {
        println(file)
        count = count + 1
      }

      // Check if file exists
      val newFileDirectory = new File("submission" + count)
      if(newFileDirectory.exists()) {
        count = count + 1
      }      
    }
    count
  }
}