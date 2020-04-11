package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.util.lastChar
import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.util.repeat

private fun main() {

    val c: Char = "abc".lastChar()
    println(c)

    val name: String = "Name"
    println(name.repeat(10))

}