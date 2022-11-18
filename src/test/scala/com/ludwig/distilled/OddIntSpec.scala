package com.ludwig.distilled

import org.scalatest.GivenWhenThen
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class OddIntSpec extends AnyWordSpecLike with GivenWhenThen with ScalaCheckPropertyChecks with Matchers {
  "OddInt" should {
    "successfully construct a valid odd number" in {
      val candidateOdd = 1
      Given(s"An odd number $candidateOdd")
      When("We attempt to construct an OddInt from it")
      val oddNumber = OddInt(candidateOdd)
      Then("The OddInt has the correct value")
      oddNumber.value shouldEqual candidateOdd
    }

    "throw an exception if try to construct an odd number from an even one" in {
      val candidateEven = 2
      Given(s"An even number $candidateEven")
      When("We attempt to construct an OddInt from it")
      Then("An exception is thrown")
      val expectedMessage = s"Candidate value $candidateEven is not odd"
      the [IllegalArgumentException] thrownBy(OddInt(candidateEven)) should have message expectedMessage
    }
  }
}
