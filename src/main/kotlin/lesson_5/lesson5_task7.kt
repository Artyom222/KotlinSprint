package org.example.lesson_5

fun main() {
    print("Расстояние поездки в километрах: ")
    val tripDistance = readln().toFloat()
    print("Расход топлива на 100 км в литрах: ")
    val litersPer100Km = readln().toFloat()
    print("Текущую цену за литр топлива: ")
    val pricePerLiter = readln().toFloat()

    val tripFuelNeeded = (tripDistance * litersPer100Km) / 100
    val totalFuelCost = tripFuelNeeded * pricePerLiter

    println("Для поездки потребуется $tripFuelNeeded л. топлива. Стоимость поздки %.2f руб.".format(totalFuelCost))

}