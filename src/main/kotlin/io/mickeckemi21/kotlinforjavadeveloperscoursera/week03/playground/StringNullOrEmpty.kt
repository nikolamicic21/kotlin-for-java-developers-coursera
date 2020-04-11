package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.playground

import io.mickeckemi21.kotlinforjavadeveloperscoursera.week02.extensions.eq

private fun main() {

    val s1: String? = null
    val s2: String? = ""

    s1.isEmptyOrNull() eq true
    s2.isEmptyOrNull() eq true

    val s3 = "   "
    s3.isEmptyOrNull() eq false


}

fun String?.isEmptyOrNull(): Boolean {
    if (this == null || this == "") return true
    return false
}