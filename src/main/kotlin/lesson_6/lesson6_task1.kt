package org.example.lesson_6

fun main() {
    println("Добро пожаловвать! Давайте зарегестрируемся!")
    print("Введите логин: ")
    val login = readln()
    print("Введите пароль: ")
    val password = readln()

    var inputLogin: String
    var inputPassword: String

    var isAuthorized = false
    while (isAuthorized == false) {
        println("Войдите в систему")
        print("Логин: ")
        inputLogin = readln()
        print("Пароль: ")
        inputPassword = readln()

        if (inputLogin == login && inputPassword == password) {
            println("Вы вошли в систему!")
            isAuthorized = true
        } else {
            println("Неверный логин или пароль. Попробуйте снова.")
        }

    }
}