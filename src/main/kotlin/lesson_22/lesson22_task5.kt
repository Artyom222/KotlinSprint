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

    val (name, description, dateTime, distance) = alphaCentauri

    println("Название: $name")
    println("Описание: $description")
    println("Дата и время: $dateTime")
    println("Расстояние: $distance световых лет")
}