package org.example.lesson_21

fun Map<String, Int>.maxSkill(): String {
    return this.maxBy { it.value }.key
}

fun main() {
    val skills = mapOf("Выпад" to 12, "Взмах" to 54, "Разворот 360" to 120, "Метание кинжала" to 120)

    println(skills.maxSkill())

}