package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop.cm2

private fun main() {

    // sealed class
    // restricts class hierarchy
    // all sub-classes must be located in the same file
    // sealed class has private default constructor
    println(eval(Sum(Sum(Num(1), Num(2)), Num(3))))

    // inner and nester classes
    // Kotlin creates by default nested class (static nested class)
    // inner keyword is used to define inner class


}

sealed class Expr

class Num(val value: Int) : Expr()

class Sum(val left: Expr, val right: Expr) : Expr()

fun eval(expr: Expr): Int = when (expr) {
    is Num -> expr.value
    is Sum -> eval(expr.left) + eval(expr.right)
    else -> 0 // in case the interface not sealed
}

class A {
    val a: String = "A"

    class B
        inner class C {

        }
}

// class delegation
interface Repository {
    fun getById(id: Int): String
    fun getAll(): List<String>
}

interface Logger {
    fun logAll()
}

class Controller(
        val repository: Repository,
        val logger: Logger
// by delegating to
) : Repository by repository, Logger by logger