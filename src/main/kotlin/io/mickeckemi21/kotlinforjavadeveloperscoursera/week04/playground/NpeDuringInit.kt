package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.playground.npe

private fun main() {

    B("a")

}

open class A(open val value: String) {
    init {
        println(value.length)
    }
}

class B(override val value: String) : A(value)

