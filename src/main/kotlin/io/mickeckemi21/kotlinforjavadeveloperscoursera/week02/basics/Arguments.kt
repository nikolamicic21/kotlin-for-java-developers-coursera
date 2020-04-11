package io.mickeckemi21.kotlinforjavadeveloperscoursera.week02

private fun main() {
    val list = listOf('a', 'b', 'c')
    println(list.joinToString(separator = "", prefix = "(", postfix = ")"))

    println(list.joinToString(postfix = "."))

    displaySeparator()
    displaySeparator('|')
    displaySeparator('=', 20)

//    displaySeparator(3, '5') // doesn't work
    displaySeparator(size = 3, character = '5')
}

@JvmOverloads
fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
    println()
}

@JvmOverloads
fun sum(a: Int = 0, b: Int = 0, c: Int = 0) = a + b + c