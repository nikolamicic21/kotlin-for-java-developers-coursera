package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz1

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {

    val heroes = listOf(
            Hero("The Captain", 60, Gender.MALE),
            Hero("Frenchy", 42, Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, Gender.FEMALE),
            Hero("First Mate", 29, Gender.MALE),
            Hero("Sir Stephen", 37, Gender.MALE)
    )

    heroes.last().name eq "Sir Stephen" // first, firstOrNull, lastOrNull
    heroes.firstOrNull { it.age == 30 }?.name eq null
    heroes.map { it.age }.distinct().size eq 5
    heroes.filter { it.age < 30 }.size eq 3
    heroes.partition { it.age < 30 }.second.size eq 3
    heroes.maxBy { it.age }?.name eq "The Captain"
    heroes.all { it.age < 50 } eq false
    heroes.any { it.gender == Gender.FEMALE } eq true

}

data class Hero(val name: String, val age: Int, val gender: Gender?)

enum class Gender { MALE, FEMALE }