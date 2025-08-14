package org.example.lesson_16

import kotlin.math.pow

private const val PI = 3.14

class Circle(private val radius: Double) {

    fun calculateCircumference(): Double {
        return 2 * PI * radius
    }

    fun calculateArea(): Double {
        return PI * radius.pow(2)
    }

    fun printCircleInfo() {
        println(
            """
            Круг с радиусом: $radius
            Длина окружности: ${"%.2f".format(calculateCircumference())}
            Площадь: ${"%.2f".format(calculateArea())}
        """.trimIndent()
        )
    }
}

fun main() {
    val circle = Circle(3.0)

    circle.printCircleInfo()
}