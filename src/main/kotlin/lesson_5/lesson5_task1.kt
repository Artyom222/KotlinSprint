package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val number1 = Random.nextInt(1, 101)
    val number2 = Random.nextInt(1, 101)
    val result = number1 + number2

    print("Для подтверждения того, что вы не робот решите пример: $number1 + $number2 = ")
    val userAnswer = readln().toInt()
    if (result == userAnswer) {
        println("Добро пожаловать!")
    } else {
        println("Доступ закрыт")
    }

}