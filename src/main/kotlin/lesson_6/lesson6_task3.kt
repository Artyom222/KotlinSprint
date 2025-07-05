package org.example.lesson_6
const val SECONDS_IN_MILLIS = 1000L

fun main() {
    println("Сколько секунд засечь? ")
    var seconds = readln().toInt()

    while (seconds > 0) {
        println("Осталось ${seconds--} секунд.")
        Thread.sleep(SECONDS_IN_MILLIS)
    }
    println("Время вышло")
}