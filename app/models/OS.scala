package models

import play.api._

import java.util.Properties
// import java.net._

import System._

case class OS(
  name: String,
  version: String,
  arch: String)

object OS {
  val name = System.getProperty("os.name")
  val version = System.getProperty("os.version")
  val arch = System.getProperty("os.arch")
  // val localhost = InetAddress.getLocalHost
  // val localIpAddress = localhost.getHostAddress 
  // val localNetworkInterface = NetworkInterface.getByInetAddress(localhost)
  // val localMacAddress = localNetworkInterface.getHardwareAddress.toList.map(b => String.format("%02x",b.asInstanceOf[AnyRef])).mkString(":") 

  // Get system full information including name, version and arch
  def getFullInformation: OS = OS(name, version, arch)

  // Get system name
  def getName: String = name

  // Get system version
  def getVersion: String = version

  // Get system arch
  def getArch: String = arch

  // // Get mac address
  // def getMACAddress: String = localMacAddress
}