package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional

private fun main() {

    val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

    val isEven: (Int) -> Boolean = { i: Int -> i % 2 == 0 }

    val result: Boolean = isEven(42)
    println(result)

    val list = listOf(1, 2, 3, 4)
    println(list.any(isEven))
    println(list.all(isEven))

    run { println("Hey!") }


    postponeComputation(1000, Runnable { println(42) })

    // () -> Int? vs (() -> Int)?
    val f: (() -> Int)? = null

//    f() // doesn't work

    if (f != null) println(f())

    println(f?.invoke())

}

fun postponeComputation(delay: Int, computation: Runnable) {
    // DO SOMETHING ASYNC
}