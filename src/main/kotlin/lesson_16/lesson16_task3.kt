package org.example.lesson_16

class User(
    private val userName: String,
    private val userPassword: String,
) {
    fun validatePassword(password: String): Boolean {
        return password == userPassword
    }
}

fun main() {
    val user = User("Alex", "qwerty123")

    println(user.validatePassword("awd"))
    println(user.validatePassword("qwerty123"))

}