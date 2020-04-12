package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop

private fun main() {

    val a = A()

    val child = Child()

    Child1()

}

class A

// concise primary constructor
class Person(val name: String, val age: Int)

class Person1(name: String) {
    val name: String

    // full primary constructor syntax
    init {
        // constructor body
        this.name = name
    }

}

class InternalComponent
    internal constructor(name: String)

class Rectangle(val height: Int, val width: Int) {

    // secondary constructor
    constructor(side: Int): this(side, side) {
        // has to call primary constructor
    }

}

interface Base
class BaseImpl : Base

open class Parent {
    init {
        println("parent")
    }
}
class Child : Parent(/*constructor call*/) {
    init {
        println("child")
    }
}

open class Parent1 {
    open val foo = 1
    init {
        // overridden getter from the child class is called
        println(this.foo)
    }
}

class Child1 : Parent1() {
    // overrides a getter of the property
    override val foo: Int = 2
}