package org.example.lesson_4

fun main() {
    val numberOfTables = 13
    val bookedForToday = 13
    val bookedForTomorrow = 9
    println("[Доступность столиков на сегодня: ${bookedForToday < numberOfTables}] \n[Доступность столиков на завтра: ${bookedForTomorrow < numberOfTables}]")

}