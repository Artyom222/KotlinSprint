package org.example.lesson_16

class User {
    val userName: String = "Alex"
    private val userPassword: String = "qwerty123"

    fun validatePassword(password: String): Boolean {
        return password == userPassword
    }
}

fun main() {
    val user = User()

    println(user.validatePassword("awd"))
    println(user.validatePassword("qwerty123"))

}