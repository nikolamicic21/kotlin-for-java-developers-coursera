package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions

private fun main() {

    val parent: Parent = Child()
    println(parent.foo())

    // instance methods always wins
    println("abc".get(1))

    // shadowed extension function
    val a = A()
    println(a.bar())
    println(a.bar(2))

}

open class Parent

class Child: Parent()

fun Parent.foo() = "parent"

fun Child.foo() = "child"

fun String.get(index: Int) = '*'

class A {
    fun bar() = 0
}

fun A.bar() = 1
fun A.bar(number: Int) = number