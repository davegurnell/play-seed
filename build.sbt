name         := "play-seed"
organization := "com.example"
version      := "0.0.1"
scalaVersion := "2.12.8"

enablePlugins(PlayScala)

scalacOptions ++= Seq(
  "-Xfatal-warnings",
)

libraryDependencies ++= Seq(
  guice,
  "org.scalatestplus.play" %% "scalatestplus-play" % "4.0.1" % Test,
)
