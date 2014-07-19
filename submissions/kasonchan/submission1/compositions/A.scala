/**
 * File: A.scala
 * Created Date: June 6, 2014
 * Status: Completed
 * Programmer: Ka-Son Chan kason.chan@ttu.edu
 * Description: This file contains the task A operations of the task graph.
 */

import java.util.Scanner
import java.io._

object A {
  def main(args: Array[String]) = {
    taskA(args(0), args(1))
  }

  def taskA(intputFileName: String, outputFileName: String) {
    // Read input file
    val scanner = new Scanner(new File(intputFileName))
    val data = scanner.nextInt()
    scanner.close()

    // Write result to output file
    val fileWriter = new PrintWriter(outputFileName)
    fileWriter.write((data).toString)
    fileWriter.write("\n")
    fileWriter.close()
  }
}
