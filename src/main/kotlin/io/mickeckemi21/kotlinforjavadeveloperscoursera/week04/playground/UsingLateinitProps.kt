package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.playground

private fun main() {

    val a = A()

    a.setUp()
    a.display()

}

class A {
    private lateinit var prop: String

    fun setUp() {
        this.prop = "value"
    }

    fun display() {
        println(this.prop)
    }

}