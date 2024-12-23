import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.3.4"

lazy val root = (project in file("."))
  .settings(

    name := "Movies",
    libraryDependencies += "com.github.tototoshi" %% "scala-csv" % "2.0.0"
    
  )
