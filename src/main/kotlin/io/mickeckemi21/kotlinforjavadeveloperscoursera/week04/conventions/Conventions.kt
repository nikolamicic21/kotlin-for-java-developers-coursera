package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.conventions

private fun main() {

    // comparison
    println("a" < "b")

    // equality check
    println("a" == "b")

    // accessing elements by index
    val list = listOf(1, 2, 3)
    println(list[0])

    val board = Board()
    board[1, 2] = 'x'
    // is replaced with board.set(1, 2, 'x')
    println(board[1, 2])

    // the in convention -> contains
    // the rangeTo convention -> start..end
    // the iterator convention
    // destructuring declarations -> val (first, second) = pair
    // val (a, b) = pair -> val a = p.component1(), val b = p.component2()

    val contact = Contact("Name", "Email", "Phone")
    val (name, _, phone) = contact
    println(name)
    println(phone)

}

class Board {
    val storage = mutableMapOf<Pair<Int,Int>, Char>()
}

operator fun Board.get(x: Int, y: Int): Char? {
    return this.storage[Pair(x, y)]
}

operator fun Board.set(x: Int, y: Int, value: Char) {
    this.storage[Pair(x, y)] = value
}

// generated methods:
// - component1() = name
// - component2() = email
// - component3() = phoneNumber
data class Contact(
    val name: String,
    val email: String,
    val phoneNumber: String
)