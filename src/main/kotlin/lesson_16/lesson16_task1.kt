package org.example.lesson_16

class Dice {
    private val number = (1..6).random()

    fun getNumber() {
        println("На кубике число $number")
    }
}

fun main() {

    val dice = Dice()
    dice.getNumber()

}