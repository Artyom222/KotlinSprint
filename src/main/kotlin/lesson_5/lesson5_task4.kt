package org.example.lesson_5

fun main() {
    val name = "Zaphod"
    val password = "PanGalactic"

    print("Введите имя пользователя: ")
    val userName = readln()

    if (userName == "")
        println("Предлагаю вам зарегестрироваться")
    else if (userName == name){
        print("Zaphod, введите пароль: ")
        val userPassword = readln()
        if (userPassword == password)
            println("Пользователь $name, вам разрешено входить на борт корабля \"Heart of Gold\"")
        else println("Неверный пароль")
    } else
        println("Пользователь с таким именем не обнаружен")

}