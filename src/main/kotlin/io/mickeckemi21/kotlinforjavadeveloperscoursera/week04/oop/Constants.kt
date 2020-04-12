package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.constants

private fun main() {

    // const - primitive types and String
    // @JvmField - reference types

}

// TOP-LEVEL
const val answer = 42

// the same as: public static final Object prop = new Object in Java
@JvmField
val prop = 42 // no getter!

// REGULAR CLASS
// regular field
class B {
    // regular field generated
    @JvmField
    val prop = Object()
}

// OBJECT
// static field
object A {
    // static field generated
    @JvmField
    val prop = Object()
}

object SuperComputer {
    // exposes as a field
    @JvmField val answer = 42

    // exposes as public static field
    const val reason = "Why not?"

    // accessed with getter within Singleton instance
    val question = "?"

    // creates static method returning the static field
    @JvmStatic
    val known = "no"
}