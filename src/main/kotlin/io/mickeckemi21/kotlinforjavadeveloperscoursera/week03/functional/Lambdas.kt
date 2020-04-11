package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional

private fun main() {

    { x: Int, y: Int -> x + y } // lambda expression

    val list = listOf(1, 2, 3, 4)
    println(list.any { i: Int -> i > 0 })
    println(list.any { i -> i > 0 })
    println(list.any { it > 0 })

    list.any {
        println("processing $it")
        it > 0 // the last expression is the result
    }

    val map = mapOf(1 to "one", 2 to "two", 3 to "three")
    map.mapValues { entry: Map.Entry<Int, String> -> println("${entry.key} -> ${entry.value}") }
    map.mapValues { (key, value) -> println("$key -> $value") }
    map.mapValues { (_, value) -> println("$value") }

}