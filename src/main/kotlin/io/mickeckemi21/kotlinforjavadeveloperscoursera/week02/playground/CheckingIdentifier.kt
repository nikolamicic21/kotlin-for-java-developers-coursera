package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.playground

private fun main() {
    println(isValidIdentifier("name"))   // true
    println(isValidIdentifier("_name"))  // true
    println(isValidIdentifier("_12"))    // true
    println(isValidIdentifier(""))       // false
    println(isValidIdentifier("012"))    // false
    println(isValidIdentifier("no$"))    // false
}

fun isValidIdentifier(s: String): Boolean {
    if (s.isEmpty() || s[0] in '0'..'9') return false

    for (c: Char in s.substring(1)) {
        if (c !in '0'..'9' && c !in 'a'..'z' && c !in 'A'..'Z') {
            return false
        }
    }

    return true
}