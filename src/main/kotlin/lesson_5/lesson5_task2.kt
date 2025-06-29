package org.example.lesson_5

import java.time.LocalDate

const val AGE_OF_MAJORITY = 18

fun main() {
    print("Введите год рождения: ")
    val userBirthYear = readln().toInt()
    val userAge = LocalDate.now().year - userBirthYear

    if (userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
    else println("Доступ к скрытому контенту закрыт")
}