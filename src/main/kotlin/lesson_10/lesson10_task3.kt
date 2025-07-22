package org.example.lesson_10

fun main() {
    print("Введите длину пароля: ")
    val passwordLength = readln().toInt()
    println("Сгенерированный пароль: ${generatePassword(passwordLength)}")
}

fun generatePassword(passwordLength: Int): String {
    var password = ""
    val digits = '0'..'9'
    val specialChars = ' '..'/'

    for (i in 0 until passwordLength) {
        password += if (i % 2 == 0) {
            digits.random()
        } else {
            specialChars.random()
        }
    }
    return password
}