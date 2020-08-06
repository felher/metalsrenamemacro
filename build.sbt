scalaVersion := "2.13.1"

name := "renamemacro"

organization := "org.felher"

scalacOptions ++= Seq(
  "-Ymacro-annotations", // macro annotations for io.circe.generic.JsonCodec
)

libraryDependencies ++= Seq(
  "io.circe"        %% "circe-core"          % "0.13.0",
  "io.circe"        %% "circe-generic"       % "0.13.0",
  "io.circe"        %% "circe-parser"        % "0.13.0",
)
