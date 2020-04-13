package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.types

private fun main() {

    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

    println(set.javaClass)
    println(list.javaClass)
    println(map.javaClass)

    val mutableList = mutableListOf(1, 2, 3)
    val immutableList: List<Int> = mutableList
    mutableList.add(4)
    println(immutableList)

}