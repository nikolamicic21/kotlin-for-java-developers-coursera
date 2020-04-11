package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.playground

private fun main() {

    println(listOf(1, 2, 3).sum())

}

fun List<Int>.sum(): Int = this.stream().mapToInt { it }.sum()