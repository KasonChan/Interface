/**
 * File: D.scala
 * Created Date: June 6, 2014
 * Status: Completed
 * Programmer: Ka-Son Chan kason.chan@ttu.edu
 * Description: This file contains the task D operations of the task graph.
 */

import java.util.Scanner
import java.io._

object D {
  def main(args: Array[String]) = {
    taskD(args(0), args(1), args(2))
  }

  def multiply(x: Int)(y: Int) = x * y

  def taskD(intputFileName1: String, intputFileName2: String, outputFileName: String) {
    // Read input file 1
    val scanner1 = new Scanner(new File(intputFileName1))
    val data1 = scanner1.nextInt()
    scanner1.close()

    // Read input file 2
    val scanner2 = new Scanner(new File(intputFileName2))
    val data2 = scanner2.nextInt()
    scanner2.close()

    // Perform multiplication
    val result = multiply(data1)(data2)

    // Write result to output file
    val fileWriter = new PrintWriter(outputFileName)
    fileWriter.write((result).toString)
    fileWriter.write("\n")
    fileWriter.close()
  }
}
