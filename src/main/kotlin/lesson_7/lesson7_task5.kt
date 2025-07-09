package org.example.lesson_7

fun main() {
    var passwordSize = 0
    while (passwordSize < 6) {
        print("Введите длину пароля, не меньше 6: ")
        passwordSize = readln().toInt()
    }

    val digits = '0'..'9'
    val letters = 'a'..'z'
    val capitalLetters = 'A'..'Z'
    var password = ""

    password += digits.random()
    password += letters.random()
    password += capitalLetters.random()

    for (i in 3 until passwordSize) {

        password += when ((1..3).random()) {
            1 -> digits.random()
            2 -> letters.random()
            3 -> capitalLetters.random()
            else -> ""
        }
    }

    password = password.toList().shuffled().joinToString("")
    println(password)
}