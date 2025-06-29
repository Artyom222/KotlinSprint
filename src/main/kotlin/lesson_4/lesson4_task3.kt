package org.example.lesson_4
const val FAVORABLE_HUMIDITY = 20
const val UNFAVORABLE_SEASON = "зима"

fun main() {
    val isSunny = true
    val isTentOpen = true
    val humidity = 20
    val currentSeason = "зима"

    println("Благоприятные ли условия сейчас для роста бобовых? ${
        isSunny && 
        isTentOpen && 
        humidity == FAVORABLE_HUMIDITY && 
        currentSeason != UNFAVORABLE_SEASON}")

}