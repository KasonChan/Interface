package models

case class User(firstname: String, lastname: String, username: String, 
  password: String) {
  def checkPassword(password: String): Boolean = this.password == password
}

object User {
  val users = List(
    User("Adam", "Smith", "adamsmith", "password"),
    User("Alice", "Osborn", "aliceosborn", "password"),
    User("Kason", "Chan", "kasonchan", "password"))

  def find(username: String): Option[User] =
    users.filter(_.username == username).headOption
}