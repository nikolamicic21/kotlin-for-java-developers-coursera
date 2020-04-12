package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.constants

private fun main() {

    // const - primitive types and String
    // @JvmField - reference types

}

const val answer = 42

// the same as: public static final Object prop = new Object in Java
@JvmField
val prop = 42 // no getter!

// static field
object A {
    // static field generated
    @JvmField
    val prop = Object()
}

// regular field
class B {
    // regular field generated
    @JvmField
    val prop = Object()
}

object SuperComputer {
    @JvmField
    /*const*/ val answer = 42

    const val reason = "Why not?"

    val question = "?"

    @JvmStatic
    val known = "no"
}