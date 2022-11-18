package com.ludwig.distilled

import org.scalatest.GivenWhenThen
import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike
import org.scalatestplus.scalacheck.ScalaCheckPropertyChecks

class EvenIntSpec extends AnyWordSpecLike with GivenWhenThen with ScalaCheckPropertyChecks with Matchers {
  "EvenInt" should {
    "successfully construct a valid even number" in {
      val candidateEven = 2
      Given(s"An even number $candidateEven")
      When("We attempt to construct an EvenInt from it")
      val evenNumber = EvenInt(candidateEven)
      Then("The EvenInt has the correct value")
      evenNumber.value shouldEqual candidateEven
    }

    "throw an exception if try to construct an even number from an odd one" in {
      val candidateOdd = 3
      Given(s"An odd number $candidateOdd")
      When("We attempt to construct an EvenInt from it")
      Then("An exception is thrown")
      val expectedMessage = s"Candidate value $candidateOdd is not even"
      the [IllegalArgumentException] thrownBy(EvenInt(candidateOdd)) should have message expectedMessage
    }
  }
}
