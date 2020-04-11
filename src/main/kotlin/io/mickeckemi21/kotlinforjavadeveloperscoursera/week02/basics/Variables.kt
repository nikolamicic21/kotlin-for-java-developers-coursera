package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.basics

private fun main() {
    val question: String = "life, the universe, and everything"
    println("$question?")

//    question = "sure?" // doesn't work

    var answer = 0
    answer = 42
    println(answer)

    val greeting: String = "Hi!"
    var number: Int = 0
//    number = "1" // doesn't work

    val languages = mutableListOf("java")
    languages.add("Kotlin")
    println(languages)

    val list = listOf("java")
//    list.add("Kotlin") // doesn't work

}
