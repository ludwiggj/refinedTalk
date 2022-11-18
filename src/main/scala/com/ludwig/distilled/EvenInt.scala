package com.ludwig.distilled

class EvenInt private(theValue: Int) {
  def value: Int = theValue
}


object EvenInt {
  def apply(candidate: Int): EvenInt =
    if (IntHelper.isEven(candidate)) {
      new EvenInt(candidate)
    } else {
      throw new IllegalArgumentException(s"Candidate value $candidate is not even")
    }
}