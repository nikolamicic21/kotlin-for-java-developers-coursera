package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.playground

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {

    val list = listOf(1, 2, 3)

    filterNonZero(list).toString() eq "[1, 2, 3]"
    filterNonZeroGenerated(list).toString() eq "[1, 2, 3]"

}

fun filterNonZero(list: List<Int>) = list.filter { it != 0 }

fun filterNonZeroGenerated(list: List<Int>): List<Int> {
    val destination = ArrayList<Int>()
    for (element in list) {
        if (element != 0) {
            destination.add(element)
        }
    }
    return destination
}

inline fun <T> Iterable<T>.filter(predicate: (T) -> Boolean): List<T> {
    val destination = ArrayList<T>()
    for (element in this) {
        if (predicate(element)) {
            destination.add(element)
        }
    }
    return destination
}
