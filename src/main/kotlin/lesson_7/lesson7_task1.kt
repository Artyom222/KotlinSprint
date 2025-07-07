package org.example.lesson_7

fun main() {
    val passwordSize = 6
    val digits = '0'..'9'
    val letters = 'a'..'z'
    var password = ""

    for (i in 0 until passwordSize) {
        if (i % 2 == 0) {
            password = password + letters.random()
        } else {
            password = password + digits.random()
        }
    }
    print(password)
}