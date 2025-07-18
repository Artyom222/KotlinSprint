package org.example.lesson_10

fun main() {
    println("Ход игрока:")
    val humanPoint = rollDice()

    println("Ход компьютера:")
    val computerPoint = rollDice()

    resultGame(humanPoint, computerPoint)
}

fun rollDice(): Int {
    val number = (1..6).random()
    println("На кубике выпало число $number")
    return number
}

fun resultGame(humanPoint: Int, computerPoint: Int) {
    if (humanPoint > computerPoint) {
        println("Победило человечество")
    } else if (humanPoint < computerPoint) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
}