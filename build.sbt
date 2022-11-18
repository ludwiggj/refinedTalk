import sbt.Keys.libraryDependencies

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.10"

lazy val root = (project in file("."))
  .settings(
    name := "refinedTalk",
    libraryDependencies ++= (prodDeps ++ testDeps)
  )

lazy val prodDeps: Seq[ModuleID] = Seq("eu.timepit" %% "refined" % "0.10.1")

lazy val testDeps: Seq[ModuleID] = Seq(
  "org.scalacheck" %% "scalacheck" % "1.17.0",
  "org.scalatest" %% "scalatest" % "3.2.14",
  "org.scalatestplus" %% "scalacheck-1-15" % "3.2.11.0"
)
