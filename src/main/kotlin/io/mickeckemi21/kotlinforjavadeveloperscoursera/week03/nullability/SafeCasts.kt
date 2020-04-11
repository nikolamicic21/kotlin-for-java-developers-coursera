package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.nullability

private fun main() {

    val s: String = "String"

    if (s is String) { // instanceof
        val s1 = s as String // type cast
        println(s1.toUpperCase())
    }

    if (s is String) {
        println(s.toLowerCase())
    }

    println((s as? String)?.toUpperCase()) // == if (s is String) s else null
//    println((s as? Int)!!.javaClass) // throws KotlinNullPointerException

}