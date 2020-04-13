package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.playground

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {
    fibonacci().take(4).toList().toString() eq
            "[0, 1, 1, 2]"

    fibonacci().take(10).toList().toString() eq
            "[0, 1, 1, 2, 3, 5, 8, 13, 21, 34]"
}

fun fibonacci() = sequence {
    var n2 = 0
    var n1 = 1
    var next: Int

    yield(n2)
    yield(n1)
    while (true) {
        next = n2 + n1
        yield(next)
        n2 = n1
        n1 = next
    }
}