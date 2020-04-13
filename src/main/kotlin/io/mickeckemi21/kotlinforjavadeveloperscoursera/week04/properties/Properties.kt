package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.properties

private fun main() {

    val kotlinClass = KotlinClass()
    println(kotlinClass.foo)

    val contact1 = Contact("Contact 1", "Address 1")
    println(contact1.address)
    contact1.address = "Address 2"
    println(contact1.address)

    // Property without field
    val rectangle = Rectangle(2, 3)
    println(rectangle.isSquare)

    println("$foo1 $foo1 $foo2 $foo2")

    StateLogger().state = State.ON

}

class KotlinClass {
    var foo = 0
}

class Contact (
    val name: String, // immutable property
    var address: String) // mutable property

class Person(val name: String, var age: String)

class Rectangle(val height: Int, val width: Int) {

    // doesn't have a field
    val isSquare: Boolean
        get() {
            return this.height == this.width
        }

}

val foo1 = run {
    println("Calculating the answer...") // only once
    42
}

val foo2: Int
    get() {
        println("Calculating the answer...")
        return 42
    }

class StateLogger {
    private var boolState = false

    var state: State
        // because property state doesn't use 'field' keyword,
        // no backing field is generated
        get() = if (this.boolState) State.ON else State.OFF
        set(value) {
            this.boolState = value == State.ON
        }
}

enum class State { ON, OFF }

class A {
    var trivialProperty: String = "abc"
        // default setter and getter
        get() = field
        set(value) {
            field = value
        }
}

class LengthCounter {
    var counter: Int = 0
        private set // enabled only within the class

    fun addWord(word: String) {
        this.counter += word.length
    }
}