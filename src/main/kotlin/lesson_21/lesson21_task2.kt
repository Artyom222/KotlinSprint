package org.example.lesson_21

fun List<Int>.evenNumbersSum(): Int {
    return this.filter { it % 2 == 0 }.sum()
}

fun main() {
    val listOfNumbers = listOf<Int>(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(listOfNumbers.evenNumbersSum())
}