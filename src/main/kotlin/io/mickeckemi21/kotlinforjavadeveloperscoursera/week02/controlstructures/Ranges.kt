package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.controlstructures

private fun main() {

    println(isLetter('G'))
    println(isLetter('*'))

    println(isDigit('A'))
    println(isNotDigit('9'))

    println(recognize('*'))
    println(recognize('8'))
    println(recognize('A'))

    // "Java".compareTo("Kotlin") <= 0 && "Kotlin".compareTo("Scala") <= 0
    println("Kotlin" in "Java".."Scala")
    println("Kotlin" in setOf("Java", "Scala"))

    val startDate = MyDate()
    val endDate = MyDate()

    val currentDate = MyDate()

//    if (currentDate in startDate..endDate) {
//        println("Current date is in between")
//    }

    if ("Kotlin" in listOf("Kotlin", "Java", "Groovy")) {
        println("Kotlin is in the list")
    }

}

// c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'
fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

// c >= '0' && c <= '9'
fun isDigit(c: Char) = c in '0'..'9'

fun isNotDigit(c: Char) = !isDigit(c)

fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "I don't know.."
}

class MyDate : Comparable<MyDate> {

    override fun compareTo(other: MyDate): Int {
        TODO("Not yet implemented")
    }
}