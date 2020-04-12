package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.properties

private fun main() {

    println(lazyValue)
    println(lazyValue)

    val activity = KotlinActivity()
    activity.initLogic()
    println(activity.data)

}

val lazyValue: String by lazy {
    println("computed!")
    "Hello"
}

class KotlinActivity {
    // can't be val
    // can't be nullable
    // has to be applied on reference type variables
    lateinit var data: String

    fun initLogic() {
        println(this::data.isInitialized) // property reference syntax
        data = "value"
        println(this::data.isInitialized)
    }

}