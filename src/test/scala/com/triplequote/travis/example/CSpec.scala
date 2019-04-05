package com.triplequote.travis.example

import org.specs2.mutable.SpecificationLike

class CSpec extends SpecificationLike {
    "C" should {
        "return it's toString name when calling C.c" in {
            C.c === C.toString
        }
    }
}