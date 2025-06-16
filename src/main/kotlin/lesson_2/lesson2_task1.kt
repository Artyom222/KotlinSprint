package org.example.lesson_2

fun main() {
    val grade = listOf(3, 4, 3, 5)
    val arithmeticMean = grade.average()
    println("%.2f".format(arithmeticMean))
}