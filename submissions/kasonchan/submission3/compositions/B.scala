/**
 * File: B.scala
 * Created Date: June 6, 2014
 * Status: Completed
 * Programmer: Ka-Son Chan kason.chan@ttu.edu
 * Description: This file contains the task B operations of the task graph.
 */

import java.util.Scanner
import java.io._

object B {
  def main(args: Array[String]) = {
    taskB(args(0), args(1))
  }
  
  def subtract(x: Int)(y: Int) = x - y

  def taskB(intputFileName: String, outputFileName: String) {
    // Read input file
    val scanner = new Scanner(new File(intputFileName))
    val data = scanner.nextInt()
    scanner.close()

    // Perform subtraction
    val result = subtract(data)(1)

    // Write result to output file
    val fileWriter = new PrintWriter(outputFileName)
    fileWriter.write((result).toString)
    fileWriter.write("\n")
    fileWriter.close()
  }
}
