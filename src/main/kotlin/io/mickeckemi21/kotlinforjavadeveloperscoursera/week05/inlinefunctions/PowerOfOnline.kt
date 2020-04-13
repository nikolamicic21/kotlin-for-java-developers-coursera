package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.inlinefunctions

private fun main() {

    // inline function:
    // compiler substitutes a body of the function
    // instead of calling it

    // 'withLock' function
    // resource management: 'use' function

    // no anonymous class or extra objects
    // are created for lambda under the hood

    // @InlineOnly
    // specifies that this function should NOT
    // be called directly without inlining
    // they are only visible in Kotlin

    // good for eliminating allocations of lambda objects

}