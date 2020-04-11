package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.controlstructures

private fun main() {
    val a = 1
    val b = 10

    val max = if (a > b) a else b
//    (a > b) ? a : b // doesn't work

    println(getDescription(Color.RED))
    println(respondToInput("no"))
    println(mix(Color.BLUE, Color.YELLOW))

    // smart-cast needs explicit variable
//    val pet: Pet = Cat()
    when (val pet: Pet = Cat()) {
        // smart-cast
        is Cat -> pet.meow()
        is Dog -> pet.woof()
    }

    println(updateWeather(22))

}

fun getDescription(color: Color): String =
    when (color) {
        Color.BLUE -> "cold"
        Color.ORANGE -> "mild"
        Color.RED -> "hot"
        else -> "Unknown color"
    }

fun respondToInput(input: String) = when (input) {
    "y", "yes" -> "I'm glad you agree"
    "n", "no" -> "Sorry to hear that"
    else -> "I don't understand you"
}

fun mix(c1: Color, c2: Color) = when (setOf(c1, c2)) {
    setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
    setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
    setOf(Color.BLUE, Color.VIOLET) -> Color.INDIGO
    else -> throw Exception("Dirty color")
}

fun updateWeather(degrees: Int): Pair<String, Color> {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.ORANGE
        else -> "hot" to Color.RED
    }

    return Pair(description, color)
}

enum class Color {
    BLUE, ORANGE, RED, YELLOW, GREEN, VIOLET, INDIGO
}

open class Pet

class Cat : Pet() {
    fun meow() = println("Meow..")
}

class Dog : Pet() {
    fun woof() = println("Woof!")
}