package org.example.lesson_6

fun main() {
    val winNumber = (1..9).random()
    var attemptCount = 5

    while (attemptCount > 0) {
        print("Введите число: ")
        val number = readln().toInt()
        --attemptCount

        if (number == winNumber) {
            println("Поздравляем! Вы выиграли!")
            break
        } else {
            println("Вы не угадали. Осталось $attemptCount опыток.")
        }
    }

    if (attemptCount == 0) {
        println("Вы проиграли. Было загадано число $winNumber")
    }

}