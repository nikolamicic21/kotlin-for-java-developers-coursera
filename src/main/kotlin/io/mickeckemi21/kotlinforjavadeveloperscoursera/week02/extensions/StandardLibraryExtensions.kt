package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions

// Kotlin standard library = JDK + extension functions
private fun main() {

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set::class) // OR set.javaClass
    println(list::class) // OR list.javaClass
    println(map::class) // OR map.javaClass

    println(listOf('a', 'b', 'c').joinToString(separator = "", prefix = "(", postfix = ")"))

    println(emptyArray<Int>().getOrNull(0))
    println(listOf(1, 2, 3).getOrNull(5))

    val strings = listOf("a", "b", "c")
    for ((index, element) in strings.withIndex()) {
        println("$index $element")
    }

    // infix fun Int.until(to: Int): IntRange
    println(1 until 10)

    // infix fun <A, B> A.to(that: B) = Pair(this, that)
    println("hot" to 23)

    println('a'.isLetter())
    println('%'.isLetterOrDigit())

    val q = """To code, 
        |or not to code
    """.trimMargin()
    println(q)

    val a = """
        Keep calm
        and learn Kotlin
    """.trimIndent()
    println(a)

    val regex = """\d{2}\.\d{2}\.\d{4}""".toRegex()
    println(regex.matches("15.02.2016"))
    println(regex.matches("15.02.16"))

    println("123".toInt())
    println("1e-10".toDouble())

//    println("xx".toInt()) // throws NumberFormatException
    println("123".toIntOrNull())
    println("xx".toIntOrNull())

    42 eq 42
    42 eq 43

}

infix fun <T> T.eq(other: T) {
    if (this == other) println("OK")
    else println("Error: $this != $other")
}