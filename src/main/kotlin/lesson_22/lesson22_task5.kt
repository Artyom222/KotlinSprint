package org.example.lesson_22

data class GalacticGuide(
    val name: String,
    val description: String,
    val dateTime: String,
    val distanceLightYears: Double,
)

fun main() {
    val alphaCentauri = GalacticGuide(
        "Alpha Centauri",
        "место размещения галактического совета",
        "четверг",
        4.3
    )

    println("Название: ${alphaCentauri.component1()}")
    println("Описание: ${alphaCentauri.component2()}")
    println("Дата и время: ${alphaCentauri.component3()}")
    println("Расстояние: ${alphaCentauri.component4()} световых лет")
}