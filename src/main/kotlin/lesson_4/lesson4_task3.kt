package org.example.lesson_4

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${isSunny && isTentOpen && humidity == 20 && currentSeason != "зима"}")

}