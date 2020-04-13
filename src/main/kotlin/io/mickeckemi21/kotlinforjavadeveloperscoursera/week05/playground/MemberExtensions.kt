package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.playground

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {

    val words = Words()
    with(words) {
        "one".record()
        +"two"
    }
    words.toString() eq "[one, two]"

}

class Words {
    private val list = mutableListOf<String>()

    fun String.record() {
        list += this
    }

    operator fun String.unaryPlus() {
        record()
    }

    override fun toString(): String = list.toString()
}