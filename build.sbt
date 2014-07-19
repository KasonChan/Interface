name := """Interface"""

version := "1.0"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)     

scalacOptions ++= Seq("-feature")

play.Project.playScalaSettings
