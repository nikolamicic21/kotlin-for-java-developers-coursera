package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.nullability

private fun main() {

//    val s1: String = null // doesn't work
    val s1: String = "always not null"
    val s2: String? = null
    val s3: String? = "can be null or not null"

    println(s1.length)
//    println(s2.length) // doesn't work

    if (s2 != null) {
        println(s2.length)
    }

    // safe call
    println(s3?.length) // if (s3 != null) s3.length else null

    // elvis operator
    val length: Int = s2?.length ?: 0
    println(length)

    question()

    val s: String? = "Not null"
    if (s == null) return
    println(s.length)

    val s5: String? = null
//    s5!!.length // throws KotlinNullPointerException

}

fun question() {
    val a: Int? = null
    val b: Int? = 1
    val c: Int = 2

    val s1 = (a ?: 0) + c
    val s2 = (b ?: 0) + c
    println("$s1$s2")
}