package org.example.lesson_10

const val CORRECT_LOGIN = "admin"
const val CORRECT_PASSWORD = "qwerty"
const val TOKEN_SIZE = 32

fun main() {
    print("Введите логин: ")
    val userLogin = readln()

    print("Введите пароль: ")
    val userPassword = readln()

    val token = authorize(userLogin, userPassword)

    println("Корзина: ${getCart(token)}")

}

fun authorize(userLogin: String, userPassword: String): String? {
    return if (userLogin == CORRECT_LOGIN && userPassword == CORRECT_PASSWORD) {
        generateToken()
    } else {
        null
    }
}

fun generateToken(): String {
    val digits = '0'..'9'
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    var token = ""

    repeat (TOKEN_SIZE) {
        token += when ((1..3).random()) {
            1 -> digits.random()
            2 -> letters.random()
            3 -> capitalLetters.random()
            else -> ""
        }
    }
    return token
}

fun getCart(token: String?): List<String>? {
    return if (token?.length == TOKEN_SIZE) {
        listOf("iPhone 15", "xbox")
    } else {
        null
    }
}
