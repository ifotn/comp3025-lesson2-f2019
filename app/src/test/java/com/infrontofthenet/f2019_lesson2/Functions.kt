package com.infrontofthenet.f2019_lesson2

// this gives us access to an activity so we can unit test it
import com.infrontofthenet.f2019_lesson2.MainActivity


import org.junit.Test

fun multiply(left: Int, right: Int = 1): Int {
    return left * right
}

class Functions {
    @Test
    fun callMultiply() {
        println(multiply(2, 3))
        println(multiply(right = 4, left = 2))
    }

    @Test
    fun callWithDefault() {
        println(multiply(6))
    }

    @Test
    fun cannotBeNull() {
        var flavour : String = "Pumpkin"

        // commented as will not build
        //flavour = null
    }

    @Test
    fun canBeNull() {
        var flavour : String? = "Pumpkin"
        flavour = null
    }

    @Test
    fun letCheck() {
        var flavour : String? = "Pumpkin"

        flavour?.let {
            println(flavour)
        }
    }

    @Test
    fun elvisCheck() {
        var flavour : String? = "Pumpkin" //null

        // if the variable is null, assign it another value
        println(flavour ?: "Something else")
    }
}