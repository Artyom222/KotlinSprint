package org.example.lesson_21

fun Map<String, Int>.maxSkill(): String {
    var maxValue = 0
    this.forEach {
        if (it.value > maxValue) {
            maxValue = it.value
        }
    }
    return this.entries.first { it.value == maxValue }.key
}

fun main() {
    val skills = mapOf("Выпад" to 12, "Взмах" to 54, "Разворот 360" to 119, "Метание кинжала" to 120)

    println(skills.maxSkill())
}