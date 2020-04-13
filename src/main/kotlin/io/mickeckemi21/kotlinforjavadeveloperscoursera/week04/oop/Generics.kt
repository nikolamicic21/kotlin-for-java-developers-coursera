package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.oop

private fun main() {



}

// generic interfaces and classes
interface List<E> {
    fun get(index: Int): E
}

class ListImp<E> : List<E> {
    override fun get(index: Int): E {
        TODO("Not yet implemented")
    }
}

fun foo(ints: List<Int>) {}

fun bar(strings: List<String>) {}

// generic functions
fun <T> List<T>.filter(predicate: (T) -> Boolean): List<T> {
    return ListImp()
}

// nullable generic argument
fun <T> List<T>.firstOrNull(): T? {
    return null
}

// non-nullable upper bound
// nullable type is not a sub-type of non-nullable Any
fun <T : Any> foo1(list: List<T>) {

}

// type parameter constraints
fun <T : Number> oneHalf(value: T): Double? {
    return null
}

fun <T : Comparable<T>> max(first: T, second: T): T {
    return first
}

// multiple constraints for a type parameter
fun <T> ensureTrailingPeriod(seq: T) where T : CharSequence, T : Appendable {

}

// the same function declaration in Java
fun List<Int>.average(): Double {
    return 0.0
}

// we need to change the name of the function
// on the byte-code level
@JvmName("averageOfDouble")
fun List<Double>.average(): Double {
    return 0.0
}