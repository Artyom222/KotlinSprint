package org.example.lesson_4

fun main() {
    val trainingDay = 5
    val exercisesForHand: Boolean
    val exercisesForLeg: Boolean
    val exercisesForBack: Boolean
    val exercisesForPress: Boolean

    if (trainingDay % 2 == 0) {
        exercisesForHand = false
        exercisesForLeg = true
        exercisesForBack = true
        exercisesForPress = false
    } else {
        exercisesForHand = true
        exercisesForLeg = false
        exercisesForBack = false
        exercisesForPress = true
    }

    println("Упражнения для рук: $exercisesForHand \nУпражнения для ног: $exercisesForLeg \nУпражнения для спины: $exercisesForBack \nУпражнения для пресса: $exercisesForPress")
}