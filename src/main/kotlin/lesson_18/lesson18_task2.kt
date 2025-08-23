package org.example.lesson_18

abstract class Dice {
    abstract val sides: Int
    abstract fun roll()
}

class Dice4() : Dice() {
    override val sides: Int = 4

    override fun roll() {
        val result = (1..sides).random()
        println("На кости D$sides выпала: $result")
    }
}

class Dice6() : Dice() {
    override val sides: Int = 6

    override fun roll() {
        val result = (1..sides).random()
        println("На кости D$sides выпала: $result")
    }
}

class Dice8() : Dice() {
    override val sides: Int = 8

    override fun roll() {
        val result = (1..sides).random()
        println("На кости D$sides выпала: $result")
    }
}

fun main() {
    val d4: Dice = Dice4()
    val d6: Dice = Dice6()
    val d8: Dice = Dice8()

    val dices = listOf<Dice>(d4,d6,d8)
    dices.forEach { it.roll() }
}