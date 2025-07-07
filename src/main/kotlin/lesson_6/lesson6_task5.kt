package org.example.lesson_6

fun main() {
    var attemptCount = 3

    println("Подтвердите, что вы не робот")

    while (attemptCount > 0) {
        val numbers = List(2) { (0..9).random() }
        print("Решите пример ${numbers[0]} + ${numbers[1]} = ")
        val answer = readln().toInt()
        --attemptCount

        when {
            answer == (numbers[0] + numbers[1]) -> {
                println("Доступ открыт")
                break
            }

            attemptCount != 0 -> {
                println("Неверно. Попробуйте еще раз")
            }

        }
    }
    if (attemptCount == 0) {
        println("Доступ закрыт!")
    }

}