name := "spark-sandbox"
 
version := "1.0"

assemblyOption in assembly := (assemblyOption in assembly).value.copy(includeScala = false)

assemblyMergeStrategy in assembly := {
  case PathList("META-INF", xs @ _*) => MergeStrategy.discard
  case x => MergeStrategy.first
}

scalaVersion := "2.11.11"

// still want to be able to run in sbt
// https://github.com/sbt/sbt-assembly#-provided-configuration
run in Compile <<= Defaults.runTask(fullClasspath in Compile, mainClass in (Compile, run), runner in (Compile, run))

//fork in run := true
javaOptions in run ++= Seq(
  "-Dlog4j.debug=true",
  "-Dlog4j.configuration=log4j.properties")


// https://github.com/JetBrains/intellij-scala/wiki/%5BSBT%5D-How-to-use-provided-libraries-in-run-configurations
lazy val intellijRunner = project.in(file("intellijRunner")).dependsOn(RootProject(file("."))).settings(
  scalaVersion := "2.11.11",
  libraryDependencies ++= sparkDependencies.map(_ % "compile")
).disablePlugins(sbtassembly.AssemblyPlugin)

lazy val sparkDependencies = Seq(
  "org.apache.spark" %% "spark-core" % "2.1.0",
  "org.apache.spark" %% "spark-sql" % "2.1.0"
)

libraryDependencies ++= sparkDependencies.map(_ % "provided")  // for assembly plugin - see project/assembly.sbt

