package org.example.lesson_4

const val MIN_CREW_COUNT = 55
const val MAX_CREW_COUNT = 70
const val MIN_FOOD_BOX = 50

fun main() {

    print("Повреждения корпуса: ")
    val hasDamage = readln().toBoolean()
    print("Состав экипажа: ")
    val crewCount = readln().toInt()
    print("Количество ящиков с провизией: ")
    val foodBoxes = readln().toInt()
    print("Благоприятность метиоусловий: ")
    val isWeatherGood = readln().toBoolean()

    val canSail = (
            !hasDamage &&
            MIN_CREW_COUNT <= crewCount &&
            crewCount <= MAX_CREW_COUNT &&
            foodBoxes > MIN_FOOD_BOX
            ) || (
            hasDamage &&
            crewCount == MAX_CREW_COUNT &&
            foodBoxes > MIN_FOOD_BOX &&
            isWeatherGood
            )
    println("Готовность коробля к отплытию: $canSail")

}