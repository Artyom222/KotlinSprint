package org.example.lesson_10

const val PASSWORD_LENGTH = 4

fun main() {
    print("Введите логин: ")
    val login = readln()

    print("Введите пароль: ")
    val password = readln()

    validateCredentialsLength(login, password)
}

fun validateCredentialsLength(login: String, password: String) {
    if (login.length < PASSWORD_LENGTH || password.length < PASSWORD_LENGTH) {
        println("Логин или пароль недостаточно длинные")
    }
}