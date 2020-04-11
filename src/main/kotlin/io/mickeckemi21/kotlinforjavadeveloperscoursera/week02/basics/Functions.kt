@file:JvmName("Util")
package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02

private fun main() {
    println(max(1, 5))
    displayMax(1, 5)
}

fun max(a: Int, b: Int): Int  = if (a > b) a else b

fun displayMax(a: Int, b: Int): Unit {
    println(max(a, b))
}