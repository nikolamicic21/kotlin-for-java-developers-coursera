package io.mickeckemi21.kotlinforjavadeveloperscoursera.week04.properties

private fun main() {

    val facebookUser = FacebookUser(123)
    println(facebookUser.nickname)

    val subscribingUser = SubscribingUser("mickeandroid21@gmail.com")
    println(subscribingUser.nickname)

    println("abc".lastIndex)
    println("abc".indices)

    val s = "abc"
    println(s.medianChar)
    println(s.medianChar)

    val sb = StringBuilder("Kotlin?")
    sb.lastChar = '!'
    println(sb)

}

interface User {
    val nickname: String // property has open getter
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = "Facebook user"
}

class SubscribingUser(private val email: String) : User {
    override val nickname: String
        get() = email.substringBefore("@")
}

interface Session {
    val user: User // property has open getter
}

fun analyzeUserSession(session: Session) {
//    if (session.user is FacebookUser) {
//        // not safe to do smart cast if property has open or custom getter
//        val user = session.user as FacebookUser
//        println(user.accountId)
//    }
    val user = session.user
    // introducing local variable, smart cast applies
    if (user is FacebookUser) {
        println(user.accountId)
    }
}

val String.lastIndex: Int
    get() = this.length - 1

val String.indices: IntRange
    get() = 0..this.lastIndex

val String.medianChar
    get(): Char? {
        println("Calculating...")
        return this.getOrNull(this.length / 2)
    }

var StringBuilder.lastChar: Char
    get() = this.get(this.length - 1)
    set(value) {
        this.setCharAt(this.length - 1, value)
    }