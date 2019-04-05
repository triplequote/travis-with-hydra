package com.triplequote.travis.example

import org.specs2.mutable.SpecificationLike

class BSpec extends SpecificationLike {
    "B" should {
        "return it's toString name when calling B.b" in {
            B.b === B.toString
        }
    }
}