package org.example.lesson_5

import kotlin.random.Random

fun main() {
    val number1 = Random.nextInt(0, 42)
    val number2 = Random.nextInt(0, 42)

    println("Введите 2 числа от 0 до 42:")
    val userNumber1 = readln().toInt()
    val userNumber2 = readln().toInt()

    if ((userNumber1 == number1 || userNumber1 == number2) &&
        (userNumber2 == number1 || userNumber2 == number2))
        println("Поздравляем! Вы выиграли главный приз!")
    else if ((userNumber1 == number1 || userNumber1 == number2) ||
        (userNumber2 == number1 || userNumber2 == number2))
        println("Вы выиграли утешительный приз!")
    else println("Неудача!")

    println("Выигрышные числа: $number1 и $number2")
}