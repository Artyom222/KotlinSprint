package org.example.lesson_7

fun main() {

    var isAuthorized = false

    while (!isAuthorized) {
        val code = (1000..9999).random()
        println(code)
        print("Введите код из сообщения: ")
        val verificationCode = readln().toInt()
        if (code == verificationCode) {
            println("Добро пожаловать!")
            isAuthorized = true
        }
    }

}