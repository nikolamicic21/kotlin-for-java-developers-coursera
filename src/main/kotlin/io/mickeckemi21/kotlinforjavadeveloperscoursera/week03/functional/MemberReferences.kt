package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional.mr

private fun main() {

    val people = listOf(Person(age = 20, name = "Marc"), Person(name = "John", age = 32))

    println(people.maxBy { it.age })
    println(people.maxBy(Person::age))

    val isEvenLambda: (Int) -> Boolean = { i: Int -> i % 2 == 0 }

//    val predicate = isEven // doesn't work
    val predicate = ::isEven // == val predicate = { i: Int -> isEven(i) }

    val action = { person: Person, message: String -> sendEmail(person, message) }
    val action2 = ::sendEmail

    val list = listOf(1, 2, 3, 4)
    println(list.any(::isEven))
    println(list.filter(::isEven))

    // Bound & Non-Bound reference
    val agePredicate: (Person, Int) -> Boolean = Person::isOlder // Non-Bound

    val alice = Person("Alice", 29)
    val agePredicateAlice = alice::isOlder // Bound
    println(agePredicateAlice(21))

}

private data class Person(val name: String, val age: Int) {
    fun isOlder(ageLimit: Int) = age > ageLimit

    fun getAgePredicate(): (Int) -> Boolean = this::isOlder
}

fun isEven(i: Int): Boolean = i % 2 == 0

private fun sendEmail(person: Person, message: String) {
    // DO SOMETHING
}