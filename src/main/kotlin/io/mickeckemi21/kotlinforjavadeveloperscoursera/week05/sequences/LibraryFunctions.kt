package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.sequences

private fun main() {

    val people = listOf(
            Person("Person 1", 24, true),
            Person("Person 2", 26, false),
            Person("Person 3", 28, true),
            Person("Person 4", 31, false)
    )

    //#1
    println(people.filter { it.age < 21 }.size)
    println(people.count { it.age < 21 })

    //#2
    println(people.sortedBy { it.age }.reversed())
    println(people.sortedByDescending { it.age })

    //#3
    println(people.map { person ->
        person.takeIf { it -> it.isPublicProfile }?.name
    }.filterNotNull())
    println(people.mapNotNull { it -> it.takeIf { it.isPublicProfile }?.name })

    //#4
    val map = mutableMapOf<Int, MutableList<Person>>()
    for (person in people) {
        if (person.age !in map) {
            map[person.age] = mutableListOf()
        }
        val group = map.getValue(person.age)
        group += person
    }
    println(map)
    val map1 = mutableMapOf<Int, MutableList<Person>>()
    for (person in people) {
        val group = map1.getOrPut(person.age, { mutableListOf() })
        group += person
    }
    println(map1)

    //#5
    val map2 = mutableMapOf<Int, MutableList<Person>>()
    for (person in people) {
        if (person.age !in map2) {
            map2[person.age] = mutableListOf()
        }
        map2.getValue(person.age) += person
    }
    println(map2)
    val map3 = people.groupBy(Person::age)
    println(map3)

    //#6
    println(people.asSequence()
            .groupBy { it.age }
            .mapValues { (_, group) -> group.size })
    println(people.asSequence()
            .groupingBy { it.age } // creates Grouping, rather than Map
            .eachCount())

}

data class Person(val name: String, val age: Int, val isPublicProfile: Boolean)