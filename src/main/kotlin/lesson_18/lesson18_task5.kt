package org.example.lesson_18

class Screen {
    fun draw(x: Int, y: Int, radius: Int): String {
        return "Нарисован круг центром в кординатах х:$x у:$y и радиусом:$radius"
    }

    fun draw(x: Float, y: Float, radius: Float): String {
        return "Нарисован круг центром в кординатах х:$x у:$y и радиусом:$radius"
    }

    fun draw(x1: Int, y1: Int, x2: Int, y2: Int): String {
        return "Нарисован квадрат с координатами в точках х1:$x1 у1:$y1 и х2:$x2 у2:$y2"
    }

    fun draw(x1: Float, y1: Float, x2: Float, y2: Float): String {
        return "Нарисован квадрат с координатами в точках х1:$x1 у1:$y1 и х2:$x2 у2:$y2"
    }

    fun draw(x: Int, y: Int): String {
        return "Нарисована точка в координатах х:$x у:$y"
    }

    fun draw(x: Float, y: Float): String {
        return "Нарисована точка в координатах х:$x у:$y"
    }
}

fun main() {
    val screen = Screen()

    println(screen.draw(512, 623, 20))
    println(screen.draw(30F, 600F, 50F, 650F))
    println(screen.draw(500, 500))
}