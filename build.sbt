
name := "TwitterStreamer"

// If you comment this out, SBT 0.10 will default to Scala 2.8.1
scalaVersion := "2.10.0" //"2.9.3"

organization := "com.streamer.twitter"

// sbt defaults to <project>/src/test/{scala,java} unless we put this in
unmanagedSourceDirectories in Test <<= Seq( baseDirectory( _ / "test" ) ).join

unmanagedSourceDirectories in Compile <<= Seq( baseDirectory( _ / "src" ) ).join

//resolvers ++= Seq("clojars" at "http://clojars.org/repo/",
//                  "clojure-releases" at "http://build.clojure.org/releases")

//libraryDependencies += "org.scala-tools.testing" % "scalatest" % "1.3" // "0.9.5" % "test->default"

libraryDependencies += "org.scalatest" % "scalatest" % "1.3"

libraryDependencies += "org.scala-tools.testing" %% "specs" % "1.6.9" //"1.6.1-2.8.0.Beta1-RC6"

libraryDependencies += "junit" % "junit" % "4.5"

libraryDependencies += "commons-httpclient" % "commons-httpclient" % "3.1"

//libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.2.3"
 
libraryDependencies += "commons-logging" % "commons-logging" % "1.1"

//libraryDependencies += "net.lag" % "configgy" % "2.0.0" //"1.5.3" 

//libraryDependencies += "net.lag" % "configgy" % "2.0.0" exclude("org.scala-tools", "vscaladoc")

libraryDependencies += "org.streum" %% "configrity-core" % "1.0.0"

//libraryDependencies += "org.json4s" % "json4s-native_2.9.2" % "3.1.0"

libraryDependencies += "org.json4s" %% "json4s-jackson" % "3.1.0"
 

// This is to prevent error [java.lang.OutOfMemoryError: PermGen space]
javaOptions += "-XX:MaxPermSize=1g"

javaOptions += "-Xmx2g"

scalacOptions += "-Yresolve-term-conflict:package"

// When doing sbt run, fork a separate process.  This is apparently needed by storm.
fork := true

// set Ivy logging to be at the highest level - for debugging
//ivyLoggingLevel := UpdateLogging.Full

// Aagin this may be useful for debugging
logLevel := Level.Info

//logBuffered := false


