package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.controlstructures

private fun main() {

    val list = listOf("a", "b", "c")
    for (s in list) {
        println(s)
    }

    val map: Map<Int, String> = mapOf(Pair(1, "one"),
                    2 to "two",
                    3 to "three")
    for ((key, value) in map) {
        println("$key = $value")
    }

    for ((index, element) in list.withIndex()) {
        println("$index: $element")
    }

    for (i in 1..9) {
        print(i)
    }
    println()

    for (i in 1 until 10) {
        print(i)
    }
    println()

    for (ch: Char in "abc") {
        print(ch + 1)
    }
    println()

    for (c: Char in '0' until '9') {
        print(c)
    }
    println()

}