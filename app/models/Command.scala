package models

import sys.process._
import language.postfixOps

object Command {
  // Change the mode bits
  def chmod(option: String)(files: String): String = {
    try {
      val chmod = "chmod" + " " + option + " " + files

      val result = (chmod !!)
      result.toString
    } catch {
      case e: Throwable => e.toString
    }
  }

  // Change the shell working directory
  def cd(directory: String): String = {
    try {
      val cd = "cd " + directory

      val result = (cd !!)
      result.toString
    } catch {
      case e: Throwable => e.toString
    }
  }

  // List directory content
  def ls(option: String): String = {
    try {
      val ls = "ls " + option

      val result = (ls !!)
      result.toString
    } catch {
      case e: Throwable => e.toString
    }
  }

  def sh(file: String)(args: String): String = {
    try {
      val sh = "./" + file + " " + args

      val result = (sh !!)
      result.toString
    } catch {
      case e: Throwable => e.toString
    }
  }
}