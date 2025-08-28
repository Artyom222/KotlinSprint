package org.example.lesson_18

import kotlin.math.pow

abstract class Box {
    abstract val name: String
    abstract fun calculateArea(): Double
}

class Cube(
    val side: Double
) : Box() {
    override val name = "Куб"

    override fun calculateArea(): Double {
        return side.pow(3)
    }
}

class Rectangle(
    val length: Double,
    val width: Double,
    val height: Double,
) : Box() {
    override val name = "Прямоугольник"

    override fun calculateArea(): Double {
        return length * width * height
    }
}

fun main() {
    val box1: Box = Cube(6.3)
    val box2: Box = Rectangle(2.1, 6.0, 4.0)
    val box3: Box = Cube(10.0)
    val box4: Box = Rectangle(3.0, 6.0, 6.0)

    val boxes = listOf<Box>(box1, box2, box3, box4)
    boxes.forEach {
        println("Объем коробоки ${it.name}: ${"%.2f".format(it.calculateArea())}")
    }
}