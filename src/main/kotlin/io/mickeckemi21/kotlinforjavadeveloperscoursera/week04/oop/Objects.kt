package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.objects

private fun main() {

    // Objects, object expression
    // companion object
    // no STATIC keyword in Kotlin

    // ===========================================================

    // object == singleton
    KSingleton.foo()

    // ===========================================================

    // object expressions replace Java's anonymous classes
    // object expressions and object declaration (singletons)
    // are different concepts

    // ===========================================================

    // companion object
    // can be replacement for Java static methods (not supported by Kotlin)
    A.foo()

    // factory features with companion object
    val a = B.create()

    // companion object can be a receiver of extension function
    val p = Person.fromJSON("json")

    // 'static' members can be declared:
    // - at the top-level
    // - inside objects
    // - inside companion objects

}

// object == singleton
object KSingleton {
    fun foo() {
        println("Foo")
    }
}

class A {
    // replacement for Java static method
    companion object {
        fun foo() = 1
    }
}

interface Factory<T> {
    fun create(): T
}

class B {
    private constructor()

    // companion object can implement an interface
    companion object : Factory<A> {
        override fun create(): A {
            return A()
        }
    }

}

class Person(val firstName: String, val lastName: String) {
    companion object {

    }
}

// defining extensions to companion object
fun Person.Companion.fromJSON(json: String): Person {
    return Person("Name", "Last Name")
}

class C {
    companion object {
        @JvmStatic fun foo() {}
        fun bar() {}
    }
}

object Obj {
    @JvmStatic fun foo() {}
    fun bar() {}
}

class D {
//    inner object B // doesn't now compile
    object B {
        fun bar() = 0
    }
}
