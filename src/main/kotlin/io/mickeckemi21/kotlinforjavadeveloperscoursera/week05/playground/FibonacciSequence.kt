package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.playground

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {
    fibonacci().take(4).toList().toString() eq
            "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}

fun fibonacci() = sequence {
    var pair = Pair(0, 1)
    while (true) {
        yield(pair.first)
        pair = Pair(pair.second, pair.first + pair.second)
    }
}