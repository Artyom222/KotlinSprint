package org.example.lesson_14

const val PI = 3.141592653589793

abstract class Figure(
    val color: String,
) {
    abstract fun calculatePerimeter(): Double
    abstract fun calculateArea(): Double
}

class Circle(
    color: String,
    val radius: Double,
) : Figure(color) {
    override fun calculatePerimeter(): Double {
        val perimeter = 2 * PI * radius
        println("Периметр круга = $perimeter")
        return perimeter
    }

    override fun calculateArea(): Double {
        val area = PI * radius * radius
        println("Площадь круга = $area")
        return area
    }

}

class Rectangle(
    color: String,
    val width: Double,
    val height: Double,
) : Figure(color) {
    override fun calculatePerimeter(): Double {
        val perimeter = 2 * (width * height)
        println("Периметр прямоугольника = $perimeter")
        return perimeter
    }

    override fun calculateArea(): Double {
        val area = height * width
        println("Площадь прямоугольника = $area")
        return area
    }
}

fun main() {
    val figures = listOf(
        Circle("белый", 5.0),
        Rectangle("черный", 2.3, 3.6),
        Circle("черный", 3.2),
        Rectangle("белый", 5.5, 2.0),
        Circle("белый", 3.8),
        Rectangle("черный", 5.0, 4.0),
    )
    var perimeterBlackFigures = 0.0
    var areaWhiteFigures = 0.0

    figures.forEach {
        if (it.color == "черный") {
            perimeterBlackFigures += it.calculatePerimeter()
        } else if (it.color == "белый") {
            areaWhiteFigures += it.calculateArea()
        }
    }

    println("Сумма периметров всех черных фигур = ${"%.2f".format(perimeterBlackFigures)}")
    println("Сумма площадей всех белых фигур = ${"%.2f".format(areaWhiteFigures)}")

}