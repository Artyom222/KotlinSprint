package org.example.lesson_7

fun main() {
    val passwordSize = 6

    for (i in 0 until passwordSize) {
        val passwordPart: Char
        if (i % 2 == 0) {
            passwordPart = ('a'..'z').random()
            print(passwordPart)
        } else {
            passwordPart = ('0'..'9').random()
            print(passwordPart)
        }
    }
}