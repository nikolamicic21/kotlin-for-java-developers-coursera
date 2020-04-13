package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.sequences

private fun main() {

    val list = listOf(1, 2, 3)
    val mapResult = list.map { it * it }
    val filterResult = mapResult.filter { it % 2 == 1 }
    val maxOddSquared = filterResult.max()

    println(maxOddSquared)

    // lambdas are inlined (no performance overhead)
    // but: intermediate collections are created for chained calls

    // Sequences - like 'Stream' in Java
    val list1 = listOf(1, 2, -3)
    val maxOddSquare = list1
            .asSequence()
            .map { it * it }
            .filter { it % 2 == 1 }
            .max()

    println(maxOddSquare)

}