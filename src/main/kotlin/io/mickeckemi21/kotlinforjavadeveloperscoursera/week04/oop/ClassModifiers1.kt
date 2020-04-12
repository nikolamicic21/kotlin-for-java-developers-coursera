package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {

    println(getDescription(Color.BLUE))

    println(Color1.BLUE.r)
    println(Color1.BLUE.rgb())

    val contact1 = Contact(address = "Address 1", name = "Contact 1")
    println(contact1)
    val contact2 = contact1.copy(address = "Address 2")
    println(contact2)

    val set1 = setOf(1, 2, 3)
    val set2 = setOf(1, 2, 3)
    // == equalTo equals
    (set1 == set2) eq true
    // === reference equality
    (set1 === set2) eq false

    val user1 = User("voldemort@gmail.com")
    user1.nickname = "Voldemort"
    println(user1)

    val user2 = User("voldemort@gmail.com")
    user2.nickname = "YouKnowWho"
    println(user2)

    (user1 == user2) eq true

}

enum class Color {
    BLUE, ORANGE, RED
}

fun getDescription(color: Color): String {
    return when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
    }
}

enum class Color1(
    val r: Int, val g: Int, val b: Int
) {
    BLUE(0, 0, 255),
    ORANGE(255, 165, 0),
    RED(255, 0, 0);

    fun rgb() = (this.r * 256 + this.g) * 256 + b
}

// generates equals, hashCode, copy, toString
// uses only properties defined in the primary constructor
// for auto-generated equals, hashCode, toString
data class Contact(val name: String, val address: String)

data class User(val email: String) {
    var nickname: String? = null
}