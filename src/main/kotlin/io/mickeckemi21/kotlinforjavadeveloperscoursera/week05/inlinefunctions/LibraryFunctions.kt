package io.mickeckemi21.kotlinforjavadeveloperscoursera.week05.inlinefunctions

private fun main() {

    // inline functions:
    // - run
    // - let
    // - takeIf
    // - takeUnless
    // - repeat
    // all these functions are declared as inline

    // run
    val foo = run {
        println("Calculating foo...")
        "foo"
    }
    println(foo)

    // let - allows to check the argument for being non-null
    val email = getEmail()
//    if (email != null) sendEmail(email)
    email?.let { e -> sendEmail(e) }
    getEmail()?.let { sendEmail(it) }
//    getEmail().let { sendEmail(it) } // doesn't work

    // takeIf - returns the receive object if
    // it satisfies the given predicate
    // otherwise returns null

    // takeUnless - returns the receiver object
    // if it does not satisfy the given predicate
    // otherwise returns null

    // repeat - repeats an action
    // for a given number of times
    repeat(10) {
        println("Repeat...")
    }

}

fun getEmail(): String? = "Email"

fun sendEmail(text: String) {

}

interface User {
    val nickname: String
}

class FacebookUser(val accountId: Int) : User {
    override val nickname = "Facebook User"
}

class SubscribingUser(private val email: String) : User {
    override val nickname: String
        get() {
            return "Subscribing User"
        }
}

interface Session {
    val user: User
}

fun analyzeUserSession(session: Session) {
//    if (session.user is FacebookUser) {
//        println(session.user.accountId)
//    }
    (session.user as? FacebookUser)?.let {
        println(it.accountId)
    }
}