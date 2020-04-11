package io.mickeckemi21.kotlinforjavadeveloperscoursera.week03.nullability

import org.jetbrains.annotations.NotNull
import org.jetbrains.annotations.Nullable

@Nullable
@NotNull
private fun main() {

    // @Nullable, @NotNull


}

fun foo(list1: List<Int?>, list2: List<Int>?) {
    list1.size
    list2?.size

    val i: Int? = list1.get(0)
    val j: Int? = list2?.get(0)

}