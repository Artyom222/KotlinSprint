package org.example.lesson_7

fun main() {
    print("Введите размер пароля: ")
    val passwordSize = readln().toInt()

    val digits = '0'..'9'
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    var password = ""

    for (i in 0 until passwordSize) {
        val option = (1..3).random()
        when (option) {
            1 -> password = password + digits.random()
            2 -> password = password + letters.random()
            3 -> password = password + capitalLetters.random()
        }
    }
    println(password)
}