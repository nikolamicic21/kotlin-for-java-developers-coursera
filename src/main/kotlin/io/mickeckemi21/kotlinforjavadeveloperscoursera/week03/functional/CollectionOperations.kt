package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.co

private fun main() {

    // filter, count, flatMap, map, find, groupBy, reduce, any, ...

    val numbers = listOf(1, 2, 3, 4, 5, 6, 7)

    println(numbers.filter { it % 2 == 0 })
    println(numbers.map { it * it })
    println(numbers.any { it % 2 == 0 })
    println(numbers.all { it % 2 == 0 })
    println(numbers.none { it % 2 == 0 })
    println(numbers.find { it % 2 == 0 }) // finds first or null
//    println(list.first { it % 10 == 0 }) // throws an exception
    println(numbers.firstOrNull { it % 10 == 0 })
    println(numbers.count { it % 2 == 0 })

    println(numbers.partition { it % 2 == 0 })

    val persons = listOf(
            Person(age = 31, name = "Alice"),
            Person(age = 29, name = "Bob"),
            Person(age = 31, name = "Carol"))

    println(persons.groupBy { it.age })
    println(persons.associateBy { it.age }) // duplications removed
    println(persons.associateBy { it.name })

    println(numbers.associate { 'a' + it to 10 * it })

    var letters = listOf('a', 'b', 'c', 'd', 'e', 'f')

    println(numbers.zip(letters))
    println(numbers.zipWithNext())

    val numbers2 = listOf(5, 6, 7, 8, 9)
    val nestedList = listOf(numbers, numbers2)
    println(nestedList.flatten())

    val words = listOf("abc", "bcd", "cde", "def")
    println(words.flatMap { it.asIterable() })

}

private data class Person(val name: String, val age: Int)