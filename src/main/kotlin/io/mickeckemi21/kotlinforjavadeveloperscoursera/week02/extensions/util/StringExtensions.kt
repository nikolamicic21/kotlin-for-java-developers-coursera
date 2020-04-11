package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.util

fun String.lastChar(): Char = this[this.length - 1]

fun String.repeat(n: Int): String {
    val sb = StringBuilder(n * this.length)
    for (i in 1..n) {
        sb.append(this)
    }
    return sb.toString()
}