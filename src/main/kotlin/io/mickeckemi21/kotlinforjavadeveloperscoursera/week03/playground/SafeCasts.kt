package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.playground

private fun main() {

    val s = ""

    println(s as? Int)
    println(s as Int?) // throws ClassCastException

}