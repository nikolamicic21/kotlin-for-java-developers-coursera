package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.sequences

private fun main() {

    val list = listOf(1, 2, 3, 4)
    // Collections - horizontal evaluation
    list.map(::m).filter(::f)
    println()
    // Sequences - vertical evaluation
    list.asSequence().map(::m).filter(::f).toList()
    println()

    list.asSequence().filter(::f).map(::m).toList()

}

fun m(i: Int): Int {
    print("m$i ")
    return i
}

fun f(i: Int): Boolean {
    print("f$i ")
    return i % 2 == 0
}