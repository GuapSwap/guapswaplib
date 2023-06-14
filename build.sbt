import dependencies._

inThisBuild(List(
  organization := "org.guapswap",  // groupId
  name := "guapswaplib-scala",     // artifactId
  homepage := Some(url("https://guapswap.org")),
  licenses := Seq("MIT" -> url("https://opensource.org/licenses/MIT")),
  description := "GuapSwapLib library written in Scala.",
  scmInfo := Some(
    ScmInfo(
      url("https://github.com/GuapSwap/guapswaplib-scala"),
      "scm:git@github.com:GuapSwap/guapswaplib-scala.git"
    )
  ),
  developers := List(
    Developer(
      "lgd",
      "Luca D'Angelo",
      "ldgaetano@protonmail.com",
      url("https://github.com/lucagdangelo")
    )
  ),

  libraryDependencies ++=
    Ergo ++
    Testing ++
    Edge ++
    Gson ++
    SigmaBuilders
  ,

  sonatypeCredentialHost := "s01.oss.sonatype.org",
  sonatypeRepository := "https://s01.oss.sonatype.org/service/local",

  resolvers ++= Seq(
    "Sonatype Releases".at(
      "https://s01.oss.sonatype.org/content/repositories/releases"
    ),
    "Sonatype Snapshots".at(
      "https://s01.oss.sonatype.org/content/repositories/snapshots"
    )
  ),

  versionScheme := Some("semver-spec"),
  assembly / assemblyJarName := s"${name.value}-${version.value}.jar",
  assembly / assemblyOutputPath := file(s"./${name.value}-${version.value}.jar/")
  
))

lazy val projectSettings = List(
  scalaVersion := "2.12.15",
  organization := "org.guapswap",
  libraryDependencies ++=
    Ergo ++
    Testing ++
    Edge ++
    Gson ++
    SigmaBuilders,

  resolvers ++= Seq(
    "Sonatype Releases".at(
      "https://s01.oss.sonatype.org/content/repositories/releases"
    ),
    "Sonatype Snapshots".at(
      "https://s01.oss.sonatype.org/content/repositories/snapshots"
    )
  )
)

lazy val commons = utils
  .mkModule("commons", "commons package for guapswaplib-scala")
  .settings(projectSettings)