package org.example.lesson_5
import kotlin.math.pow
const val CENTIMETERS_TO_METERS = 100

fun main() {
    print("Введите вес в килграммах: ")
    val userWeight = readln().toFloat()
    print("Введите рост в сантиметрах: ")
    val userHeightCentimetre = readln().toFloat()
    val userHeightMetre = userHeightCentimetre / CENTIMETERS_TO_METERS

    val bodyMassIndex = userWeight / userHeightMetre.pow(2)

    when {
        bodyMassIndex < 18.5 -> println("Недостаточная масса тела")
        bodyMassIndex < 25 -> println("Нормальная масса тела")
        bodyMassIndex < 30 -> println("Избыточная масса тела")
        bodyMassIndex >= 30 -> println("Ожирение")
    }
    println("Индекс массы тела = %.2f".format(bodyMassIndex))
}