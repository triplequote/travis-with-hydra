package com.triplequote.travis.example

import org.specs2.mutable.SpecificationLike

class DSpec extends SpecificationLike {
    "D" should {
        "return it's toString name when calling D.d" in {
            D.d === D.toString
        }
    }
}