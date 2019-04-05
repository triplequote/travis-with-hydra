package com.triplequote.travis.example

import org.specs2.mutable.SpecificationLike

class ASpec extends SpecificationLike {
    "A" should {
        "return it's toString name when calling A.a" in {
            A.a === A.toString
        }
    }
}