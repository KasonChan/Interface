package models

import anorm._
import anorm.SQL
import anorm.SqlQuery

import play.api.Play.current
import play.api.db.DB

case class User(
  firstname: String,
  lastname: String,
  username: String,
  password: String)

object User {
  // Empty list of messages
  val emptyMessages = List("")

  // Empty list of errors
  val emptyErrors = List("")

  // Empty user
  val emptyUser = User("", "", "", "")

  val selectAll: SqlQuery = SQL("select * from users order by firstname asc;")

  // Create connection before running code, and close it afterward
  // Make connection implicitly available
  def getAll: List[User] = DB.withConnection { implicit connection =>
    // Iterate over each row
    selectAll().map(row =>
      // Create user from contents of each row
      User(row[String]("firstname"), row[String]("lastname"),
        row[String]("username"), row[String]("password"))).toList
  }

  // def get(un: String): List[User] = {
  //   // Call getAll to get all users and filter out by username
  //   getAll.filter((x: User) => x.username == un).toList
  // }

  def get(username: String): User = {
    val select = SQL("""select * from users u 
      where u.username = {username} order by u.firstname asc;""").on(
      "username" -> username)

    // Create connection before running code, and close it afterward
    // Make connection implicitly available
    val user = DB.withConnection { implicit connection =>
      select().map(row =>
        // Create user from contents of each row
        User(row[String]("firstname"), row[String]("lastname"),
          row[String]("username"), row[String]("password"))).toList
    }

    if (user.isEmpty)
      User("", "", "", "")
    else
      user.head
  }

  def insert(user: User): Boolean = DB.withConnection { implicit connection =>
    // Identifiers surrounded by curly braces denote named parameters to be 
    // mapped with the elements in on(...)
    val addedRows = SQL("""insert into users values ({firstname}, {lastname}, 
      {username}, {password})""").on(
      // Each named parameter is mapped to its value
      "firstname" -> user.firstname,
      "lastname" -> user.lastname,
      "username" -> user.username,
      "password" -> user.password).executeUpdate()
    // executeUpdate returns the number of rows the statement has affected
    addedRows == 1
  }

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