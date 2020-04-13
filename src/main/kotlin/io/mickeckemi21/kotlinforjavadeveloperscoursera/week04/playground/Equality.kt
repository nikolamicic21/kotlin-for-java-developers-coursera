package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.playground

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {
    equals1(Value("abc"), Value("abc")) eq  true
    equals1(Value("abc"), null) eq false
    equals1(null, Value("abc")) eq false
    equals1(null, null) eq true

    equals2(Value("abc"), Value("abc")) eq true
    equals2(Value("abc"), null) eq false
    equals2(null, Value("abc")) eq false
    equals2(null, null) eq true
}

data class Value(val s: String)

fun equals1(v1: Value?, v2: Value?): Boolean {
    return v1 == v2
}

// only equals and ===
fun equals2(v1: Value?, v2: Value?): Boolean {
    return v1?.equals(v2) ?: (v2 === null)
}