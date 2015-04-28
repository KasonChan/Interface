name := """Interface"""

version := "1.1"

lazy val `interface` = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.11.1"

libraryDependencies ++= Seq(
  jdbc,
  anorm,
  cache
)

scalacOptions ++= Seq("-feature")

unmanagedResourceDirectories in Test <+= baseDirectory(_ / "target/web/public/test")
