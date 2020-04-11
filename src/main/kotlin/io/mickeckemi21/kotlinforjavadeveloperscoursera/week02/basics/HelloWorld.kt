package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02

private fun main() {
    println("Main function WITHOUT args")
}

fun main(args: Array<String>) {
    println("Main function WITH args")
    println("Hello with args#getOrNull() ${args.getOrNull(0)}")
    val name = if (args.isNotEmpty()) args[0] else "Kotlin"
    println("Hello $name!")
    println("Name starts with 'K': ${name.startsWith("K")}")
}