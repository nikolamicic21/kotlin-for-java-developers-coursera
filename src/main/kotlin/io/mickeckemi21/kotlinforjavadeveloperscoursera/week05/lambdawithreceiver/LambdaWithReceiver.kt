package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.lambdawithreceiver

private fun main() {

    // extension function & lambda
    val sb = StringBuilder()
    sb.appendln("Alphabet: ")
    for (c in 'a'..'z') {
        sb.append(c)
    }
    println(sb.toString())

    // with
    val sb1 = StringBuilder()
    with (sb1) {
        appendln("Alphabet: ")
        for (c in 'a'..'z') {
            append(c)
        }
        println(toString())
    }

    // lambda with receiver
    // lambda with implicit this
    val sb2 = StringBuilder()
    with (sb2) {
        this.appendln("Alphabet: ")
        for (c in 'a'..'z') {
            this.append(c)
        }
        println(this.toString())
    }

    // regular function -> regular lambda
    // extension function -> lambda with receiver (extension lambda)
    val isOdd: Int.() -> Boolean = { this % 2 == 1 }
    println(1.isOdd())

    // buildString
    val s: String = buildString {
        this.appendln("Alphabet: ")
        for (c in 'a'..'z') {
            this.append(c)
        }
    }

}