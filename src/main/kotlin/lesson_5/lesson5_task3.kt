package org.example.lesson_5

fun main() {
    val number1 = (0..42).random()
    val number2 = (0..42).random()

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