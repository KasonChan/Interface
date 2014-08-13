package models

import anorm._
import anorm.SQL
import anorm.SqlQuery

import play.api.Play.current
import play.api.db.DB

case class Destination(
  username: String,
  destinationUsername: String,
  destinationHostname: String,
  destinationPassword: String,
  destinationType: String)

object Destination {
  /**
   * Get all the destinations and order by username
   */
  val selectAll: SqlQuery = SQL("""select * from destinations 
    order by username asc;""")

  // Create connection before running code, and close it afterward
  // Make connection implicitly available
  def getAll: List[Destination] = DB.withConnection { implicit connection =>
    // Iterate over each row
    selectAll().map(row =>
      // Create user from contents of each row
      Destination(row[String]("username"), row[String]("destinationUsername"),
        row[String]("destinationHostname"),
        row[String]("destinationPassword"),
        row[String]("destinationType"))).toList
  }

  // def get(un: String): List[Destination] = {
  //   // Call getAll to get all users and filter out by username
  //   getAll.filter((x: Destination) => x.username == un).toList
  // }

  /**
   * Get all the destinations by the username
   */
  def get(un: String): List[Destination] = {
    val select = SQL("""select * from destinations d where d.username = {un} 
      order by d.destinationUsername asc, d.destinationHostname asc;""").on(
      "un" -> un)

    // Create connection before running code, and close it afterward
    // Make connection implicitly available
    DB.withConnection { implicit connection =>
      select().map(row =>
        // Create destination from contents of each row
        Destination(row[String]("username"), row[String]("destinationUsername"),
          row[String]("destinationHostname"),
          row[String]("destinationPassword"),
        row[String]("destinationType"))).toList
    }
  }

  /**
   * Find the destination if existed in the database by the username,
   * destinationUsername and destinationHostname
   */
  def find(un: String, dun: String, dhn: String): List[Destination] = {
    val select = SQL("""select * from destinations d 
      where d.username = {un} AND d.destinationUsername = {dun} AND 
      d.destinationHostname = {dhn} 
      order by d.destinationUsername asc, d.destinationHostname asc;""").on(
      "un" -> un, "dun" -> dun, "dhn" -> dhn)

    // Create connection before running code, and close it afterward
    // Make connection implicitly available
    DB.withConnection { implicit connection =>
      select().map(row =>
        // Create destination from contents of each row
        Destination(row[String]("username"), row[String]("destinationUsername"),
          row[String]("destinationHostname"),
          row[String]("destinationPassword"),
        row[String]("destinationType"))).toList
    }
  }

  /**
   * Insert the new destination into the destinations database
   */
  def insert(destination: Destination): Boolean = DB.withConnection {
    // Identifiers surrounded by curly braces denote named parameters to be 
    // mapped with the elements in on(...)
    implicit connection =>
      val addedRows = SQL("""insert into destinations 
      values ({username}, {destinationUsername}, {destinationHostname}, 
        {destinationPassword}, {destinationType})""").on(
        // Each named parameter is mapped to its value
        "username" -> destination.username,
        "destinationUsername" -> destination.destinationUsername,
        "destinationHostname" -> destination.destinationHostname,
        "destinationPassword" -> destination.destinationPassword,
        "destinationType" -> destination.destinationType).executeUpdate()
      // executeUpdate returns the number of rows the statement has affected
      addedRows == 1
  }

  def update(destination: Destination): Boolean = DB.withConnection {
    implicit connection =>
      val updatedRows = SQL("""update destinations 
      set destinationPassword = {destinationPassword},
      destinationType = {destinationType} 
      where username = {username} AND 
      destinationUsername = {destinationUsername} AND
      destinationHostname = {destinationHostname};""").on(
        "username" -> destination.username,
        "destinationUsername" -> destination.destinationUsername,
        "destinationHostname" -> destination.destinationHostname,
        "destinationPassword" -> destination.destinationPassword,
        "destinationType" -> destination.destinationType).executeUpdate()
      updatedRows == 1
  }

  def delete(destination: Destination): Boolean = DB.withConnection {
    implicit connection =>
      val updatedRows = SQL("""delete from destinations 
      where username = {username} AND 
      destinationUsername = {destinationUsername} AND 
      destinationHostname = {destinationHostname}""").on(
        "username" -> destination.username,
        "destinationUsername" -> destination.destinationUsername,
        "destinationHostname" -> destination.destinationHostname).executeUpdate()
      updatedRows == 0
  }
}