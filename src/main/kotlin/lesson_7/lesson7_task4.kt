package org.example.lesson_7
const val MILLIS_IN_SECOND = 1000L

fun main() {
    print("Сколько засечь секунд? ")
    val timer = readln().toInt()

    for (second in timer downTo  1) {
        println("Секунд осталось: $second")
        Thread.sleep(MILLIS_IN_SECOND)
    }
    println("Время вышло!")
}