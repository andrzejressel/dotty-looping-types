lazy val lib = project.in(file("lib"))
  .settings(
    name := "scala33-compiler-crash-lib",
    scalacOptions ++= Seq("-Xfatal-warnings", "-deprecation", "-Wunused:all"),
    version :="0.1.0-SNAPSHOT",
    scalaVersion := "3.3.0",
)

lazy val root = project
  .in(file("."))
  .aggregate(lib)
  .dependsOn(lib)
  .settings(
    name := "scala33-compiler-crash",
      scalacOptions ++= Seq("-Xfatal-warnings", "-deprecation", "-Wunused:all"),
      version := "0.1.0-SNAPSHOT",
      scalaVersion := "3.3.0",
  )
