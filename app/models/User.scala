package models

case class User(username: String, password: String) {
  def checkPassword(password: String): Boolean = this.password == password
}

object User {
  val users = List(
    User("bob", "password"),
    User("alice", "password"),
    User("jane", "password"))

  def find(username: String): Option[User] =
    users.filter(_.username == username).headOption
}