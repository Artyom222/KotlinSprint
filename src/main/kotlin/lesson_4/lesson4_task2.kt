package org.example.lesson_4

fun main() {
    val maxWeight = 100
    val minWeight = 35
    val maxVolume = 100

    var weight = 20
    var volume = 80
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > minWeight && weight <= maxWeight && volume < maxVolume}")
    println()
    weight = 50
    volume = 100
    println("Груз с весом $weight кг и объемом $volume л соответствует категории 'Average': ${weight > minWeight && weight <= maxWeight && volume < maxVolume}")

}