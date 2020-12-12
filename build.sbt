import Dependencies._

ThisBuild / scalaVersion := "2.13.4"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "br.com.blz"
ThisBuild / organizationName := "belezanaweb"

lazy val root = (project in file("."))
  .settings(
      name := "test-scala",
      libraryDependencies += "com.typesafe.akka" %% "akka-http" % "10.1.11",
      libraryDependencies += "com.typesafe.akka" %% "akka-stream" % "2.5.26",
      libraryDependencies += "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.11",
      libraryDependencies += "io.spray" %% "spray-json" % "1.3.5",
      libraryDependencies += "com.github.blemale" %% "scaffeine" % "3.1.0" % "compile",
      libraryDependencies += "com.typesafe.akka" %% "akka-stream-testkit" % "2.5.26" % Test,
      libraryDependencies += "com.typesafe.akka" %% "akka-http-testkit" % "10.1.11" % Test,
      libraryDependencies += "org.scalamock" %% "scalamock" % "4.4.0" % Test,
      libraryDependencies += scalaTest % Test
  )
