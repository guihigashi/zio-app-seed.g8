// give the user a nice default project!
ThisBuild / organization := "$organization$"
ThisBuild / scalaVersion := "$scalaVersion$"

lazy val zioVersion = "$zioVersion$"

lazy val root = project
  .file(".")
  .settings(
    name        := "$name$",
    description := "$description$",
    libraryDependencies ++= Seq(
      "dev.zio" %% "zio"               % zioVersion,
      "dev.zio" %% "zio-streams"       % zioVersion,
      "dev.zio" %% "zio-test"          % zioVersion % Test,
      "dev.zio" %% "zio-test-sbt"      % zioVersion % Test,
      "dev.zio" %% "zio-test-magnolia" % zioVersion % Test
    ),
    testFrameworks += new TestFramework("zio.test.sbt.ZTestFramework")
  )
