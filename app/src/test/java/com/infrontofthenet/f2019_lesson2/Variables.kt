package com.infrontofthenet.f2019_lesson2

import org.junit.Test



class VariablesTest {

    @Test
    fun readOnly() {
        val flavour = "Cookie Dough"

        // must be disabled to build as val cannot be reassigned
        //flavour = "World Class Chocolate"
    }

    @Test
    fun mutable() {
        var flavour = "Cookie Dough"
        flavour = "World Class Chocolate"
    }

    @Test
    fun callMultiply() {
        println(multiply(2, 3))
    }
}