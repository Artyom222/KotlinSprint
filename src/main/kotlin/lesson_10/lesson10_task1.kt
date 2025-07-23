package org.example.lesson_10

fun main() {
    println("Ход игрока:")
    val humanPoint = rollDice1()

    println("Ход компьютера:")
    val computerPoint = rollDice1()

    resultGame1(humanPoint, computerPoint)
}

fun rollDice1(): Int {
    val number = (1..6).random()
    println("На кубике выпало число $number")
    return number
}

fun resultGame1(humanPoint: Int, computerPoint: Int) {
    if (humanPoint > computerPoint) {
        println("Победило человечество")
    } else if (humanPoint < computerPoint) {
        println("Победила машина")
    } else {
        println("Победила дружба")
    }
}