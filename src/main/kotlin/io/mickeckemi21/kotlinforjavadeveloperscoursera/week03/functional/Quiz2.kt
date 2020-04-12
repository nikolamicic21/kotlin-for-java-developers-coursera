package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz2

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq
import io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz1.Hero

private fun main() {

    val heroes = listOf(
            Hero("The Captain", 60, io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz1.Gender.MALE),
            Hero("Frenchy", 42, io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz1.Gender.MALE),
            Hero("The Kid", 9, null),
            Hero("Lady Lauren", 29, io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz1.Gender.FEMALE),
            Hero("First Mate", 29, io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz1.Gender.MALE),
            Hero("Sir Stephen", 37, io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.quiz1.Gender.MALE)
    )

    //#9
    val mapByAge: Map<Int, List<Hero>> =
            heroes.groupBy { it.age }
    val (age, group) = mapByAge.maxBy { (_, group) -> group.size }!!
    age eq 29

    //#10
    val mapByName: Map<String, Hero> =
            heroes.associateBy { it.name }
    mapByName["Frenchy"]?.age eq 42 // mapByName.getValue("unknown").age throws NoSuchElementException

    //#11
    val mapByNameAssociate = heroes.associate { it.name to it.age }
    mapByNameAssociate.getOrElse("unknown") { 0 } eq 0

    //#12
    val (first, _) = heroes
            .flatMap { heroes.map { hero -> it to hero } }
            .maxBy { it.first.age - it.second.age }!!
    first.name eq "The Captain"
    // the same
    val oldest = heroes.maxBy(Hero::age)
    oldest?.name eq "The Captain"

}

data class Hero(val name: String, val age: Int, val gender: Gender?)

enum class Gender {
    MALE, FEMALE
}
