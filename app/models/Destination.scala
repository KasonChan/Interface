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
  destinationPassword: String)

object Destination {
  val selectAll: SqlQuery = SQL("select * from destinations order by username asc;")

  // Create connection before running code, and close it afterward
  // Make connection implicitly available
  def getAll: List[Destination] = DB.withConnection { implicit connection =>
    // Iterate over each row
    selectAll().map(row =>
      // Create user from contents of each row
      Destination(row[String]("username"), row[String]("destinationUsername"),
        row[String]("destinationHostname"),
        row[String]("destinationPassword"))).toList
  }

  // def get(un: String): List[Destination] = {
  //   // Call getAll to get all users and filter out by username
  //   getAll.filter((x: Destination) => x.username == un).toList
  // }

  def get(un: String): List[Destination] = {
    val select = SQL("""select * from destinations d where d.username = {un} 
      order by d.destinationUsername asc;""").on("un" -> un)

    // Create connection before running code, and close it afterward
    // Make connection implicitly available
    DB.withConnection { implicit connection =>
      select().map(row =>
        // Create destination from contents of each row
        Destination(row[String]("username"), row[String]("destinationUsername"),
          row[String]("destinationHostname"),
          row[String]("destinationPassword"))).toList
    }
  }

  def insert(destination: Destination): Boolean = DB.withConnection {
    // Identifiers surrounded by curly braces denote named parameters to be 
    // mapped with the elements in on(...)
    implicit connection => val addedRows = SQL("""insert into destinations 
      values ({username}, {destinationUsername}, {destinationHostname}, 
        {destinationPassword})""").on(
        // Each named parameter is mapped to its value
        "username" -> destination.username,
        "destinationUsername" -> destination.destinationUsername,
        "destinationHostname" -> destination.destinationHostname,
        "destinationPassword" -> destination.destinationPassword).executeUpdate()
      // executeUpdate returns the number of rows the statement has affected
      addedRows == 1
  }

  //
  // TODO: Add username as parameter
  // 
  def update(user: User): Boolean = DB.withConnection { implicit connection =>
    val updatedRows = SQL("""update users set firstname = {firstname},
      lastname = {lastname}, password = {password} 
      where username = {username}""").on(
      "firstname" -> user.firstname,
      "lastname" -> user.lastname,
      "username" -> user.username,
      "password" -> user.password).executeUpdate()
    updatedRows == 1
  }

  def delete(user: User): Boolean = DB.withConnection { implicit connection =>
    val updatedRows = SQL("delete from users where username = {username}").on(
      "username" -> user.username).executeUpdate()
    updatedRows == 0
  }
}