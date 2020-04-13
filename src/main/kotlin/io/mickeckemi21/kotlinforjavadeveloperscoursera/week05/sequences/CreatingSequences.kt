package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.sequences

import kotlin.random.Random

private fun main() {

    // Generating sequence
    val seq = generateSequence {
        Random.nextInt(5).takeIf { it > 0 }
    }
    println(seq.toList())

    // generating an infinite sequence
    val numbers = generateSequence(0) { it + 1 }
    println(numbers.take(5).toList())

    val numbers1 = generateSequence(3) { n ->
        println("Generating element...")
        (n + 1).takeIf { it < 7 }
    }
    println(numbers1.first())

    // yield - library function
    // yieldAll
    val numbers2 = sequence {
        var x = 0
        while (true) {
            yield(x++)
        }
    }
    println(numbers2.take(5).toList())

    println(mySequence().map { it * it }.filter { it > 10 }.take(1))
    println(mySequence().map { it * it }.filter { it > 10 }.first())
}

fun mySequence() = sequence {
    println("yield one element")
    yield(1)
    println("yield a range")
    yieldAll(3..5)
    println("yield a list")
    yieldAll(listOf(7, 9))
}