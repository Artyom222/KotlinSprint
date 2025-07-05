package org.example.lesson_6
const val SECONDS_TO_MILLIS = 1000

fun main() {
    println("Сколько секунд засечь?")
    val seconds = readln().toInt()
    val millis = seconds * SECONDS_TO_MILLIS

    if (millis > 0) {
        Thread.sleep(millis.toLong())
        print("Прошло $seconds секунд.")
    }
}