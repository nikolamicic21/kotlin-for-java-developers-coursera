package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.exceptions

import java.io.IOException

private fun main() {
    val number = 99

    // throw is an expression
    val percentage =
            if (number in 0..100)
                number
            else
                throw IllegalArgumentException(
                        "A percentage value must be " +
                        "between 0 and 100: $number")
    println(percentage)

    // try is an expression
    val numberText = "abc"
    val result = try {
        Integer.parseInt(numberText)
    } catch (ex: NumberFormatException) {
        return // or null
    }
    println(result)

}

@Throws(IOException::class)
fun foo() {
    throw IOException()
}