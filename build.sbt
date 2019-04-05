organizationName := "Triplequote LLC"
organizationHomepage := Some(url("https://triplequote.com"))
homepage := Some(url("https://github.com/triplequote/travis-with-hydra"))
startYear := Some(2019)
licenses := Seq("Apache-2.0" -> url("http://www.apache.org/licenses/LICENSE-2.0.txt"))
scmInfo := Some(ScmInfo(url("https://github.com/triplequote/sbt-scalabench"), "scm:git:git@github.com:triplequote/travis-with-hydra.git"))
description := "A repo to showcase and explain how to set up Travis to compile a sbt Scala project using the Triplequote Hydra parallel compiler"

name := "travis-with-hydra"
organization := "com.triplequote"
version := "1.0.0"


lazy val example = (project in file("."))
  .settings(
    scalaVersion := "2.12.8",
    libraryDependencies ++= Seq(
      "org.specs2" %% "specs2-core" % "4.5.1" % Test,
    ),
  )
