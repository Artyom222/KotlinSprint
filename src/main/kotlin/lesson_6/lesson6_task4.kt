package org.example.lesson_6

fun main() {
    val winNumber = (1..9).random()
    var isWin = false
    var attemptCount = 5
    var number: Int

    while (!isWin && attemptCount > 0) {
        print("Введите число: ")
        number = readln().toInt()
        --attemptCount

        if (number == winNumber) {
            println("Поздравляем! Вы выиграли!")
            isWin = true
        } else {
            println("Вы не угадали. Осталось $attemptCount опыток.")
        }
    }

    if (attemptCount == 0) {
        println("Вы проиграли. Было загадано число $winNumber")
    }

}