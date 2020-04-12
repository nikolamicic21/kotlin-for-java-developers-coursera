package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.functional

private fun main() {

    println(duplicateNonZero(listOf(3, 0, 5)))
    println(duplicateNonZeroLocalFunction(listOf(3, 0, 5)))
    println(duplicateNonZeroAnonymousFunction(listOf(3, 0, 5)))

    val list = listOf(1, 2, 3, 4, 5)
    list.forEach {
        if (it == 0) return@forEach
        print(it)
    }
    // the same as
    for (element in list) {
        if (element == 0) continue
        print(element)
    }

}

fun duplicateNonZeroAnonymousFunction(list: List<Int>): List<Int> {
    return list.flatMap(fun (elem): List<Int> {
        if (elem == 0) return listOf()
        return listOf(elem, elem)
    })
}

fun duplicateNonZeroLocalFunction(list: List<Int>): List<Int> {
    fun duplicateNonZeroElement(elem: Int): List<Int> {
        if (elem == 0) return listOf()
        return listOf(elem, elem)
    }

    return list.flatMap(::duplicateNonZeroElement)
}

fun duplicateNonZero(list: List<Int>): List<Int> {
    return list.flatMap {
        if (it == 0) return@flatMap listOf<Int>()
        listOf(it, it)
    }
//    return list.flatMap l@{
//        if (it == 0) return@l listOf<Int>()
//        listOf(it, it)
//    }
}

fun containsZero(list: List<Int>): Boolean {
//    for (i in list) {
//        if (i == 0) return true
//    }
    list.forEach {
        if (it == 0) return true
    }
    return false
}