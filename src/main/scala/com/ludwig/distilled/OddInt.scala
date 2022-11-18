package com.ludwig.distilled

class OddInt private(theValue: Int) {
  def value: Int = theValue
}

object OddInt {
  def apply(candidate: Int): OddInt =
    if (IntHelper.isOdd(candidate)) {
      new OddInt(candidate)
    } else {
      throw new IllegalArgumentException(s"Candidate value $candidate is not odd")
    }
}
