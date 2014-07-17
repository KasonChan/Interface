/**
 * File: C.scala
 * Created Date: June 6, 2014
 * Status: Completed
 * Programmer: Ka-Son Chan kason.chan@ttu.edu
 * Description: This file contains the task C operations of the task graph.
 */

import java.util.Scanner
import java.io._

object C {
  def main(args: Array[String]) = {
    taskC(args(0), args(1))
  }

  def add(x: Int)(y: Int) = x + y

  def taskC(intputFileName: String, outputFileName: String) {
    // Read input file
    val scanner = new Scanner(new File(intputFileName))
    val data = scanner.nextInt()
    scanner.close()

    // Perform addition
    val result = add(data)(1)

    // Write result to output file
    val fileWriter = new PrintWriter(outputFileName)
    fileWriter.write((result).toString)
    fileWriter.write("\n")
    fileWriter.close()
  }
}
