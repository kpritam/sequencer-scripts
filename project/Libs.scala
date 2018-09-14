import sbt._

object Libs {
//  private val Org     = "org.tmt"
//  private val Version = "0.1-SNAPSHOT"

  private val Org     = "com.github.tmtsoftware.esw-prototype"
  private val Version = "ac28509"

  val `sequencer-framework` = Org             %% "ocs-framework" % Version
  val `scalaTest`           = "org.scalatest" %% "scalatest"           % "3.0.4" % Test
}
