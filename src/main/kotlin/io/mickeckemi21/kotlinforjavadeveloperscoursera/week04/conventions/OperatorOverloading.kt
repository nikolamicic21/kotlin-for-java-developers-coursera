package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.conventions

private fun main() {

    val a = Point(1, 2)
    val b = Point(2, 3)
    println(a + b)

    // + -> plus
    // - -> minus
    // * -> times
    // / -> div
    // % -> mod

    // Unary operators
    // -a -> a.unaryMinus
    // +a -> a.unaryPlus
    // !a -> not
    // ++a, a++ -> inc
    // --a, a-- -> dec

    // assignment operations
    // a+=b either
    // a = a.plus(b) (mutable) or
    // a.plusAssign(b) (immutable)

    var list1 = listOf(1, 2, 3)
    val list2 = list1
    list1 += 4
    println(list1)
    println(list2)

    // var list = listOf(1, 2, 3)
    // list += 4
    // list = list + 4 (new list is created)

    val list3 = mutableListOf(1, 2, 3)
    val list4 = list3
    list3 += 4
    println(list3)
    println(list4)


}

data class Point(val x: Int, val y: Int)

operator fun Point.plus(other: Point): Point {
    return Point(x + other.x, y + other.y)
}

operator fun Point.times(scale: Int): Point {
    return Point(x * scale, y * scale)
}