package com.ludwig.distilled

import org.scalacheck.Gen

object MyGen {
  val intGen: Gen[Int] = Gen.chooseNum(Int.MinValue, Int.MaxValue)
  val oddIntsGen: Gen[Int] = intGen.filter(IntHelper.isOdd)
  val evenIntsGen: Gen[Int] = intGen.filter(IntHelper.isEven)

  val oddGen: Gen[OddInt] = oddIntsGen.map(OddInt.apply)
  val evenGen: Gen[EvenInt] = evenIntsGen.map(EvenInt.apply)
}
