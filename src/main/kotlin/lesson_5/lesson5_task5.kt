package org.example.lesson_5

const val LOTTERY_SIZE = 3

fun main() {
    val lotteryNumbers = mutableListOf<Int>()
    for (i in 0 until LOTTERY_SIZE)
        lotteryNumbers.add((0..42).random())

    println("Введите 3 числа от 0 до 42:")
    val userNumbers = mutableListOf<Int>()
    for (i in 0 until LOTTERY_SIZE)
        userNumbers.add(readln().toInt())

    val matches = lotteryNumbers.intersect(userNumbers).size
    when (matches) {
        3 -> println("Вы отгадали все три числа и выиграли ДЖЕКПОТ!!!")
        2 -> println("Вы отгадали два числа и выиграли крупный приз!")
        1 -> println("Вы отгадали одно число и получаете утешительный приз")
        0 -> println("Неудача, вы не отгадали числа")
    }

    print("Выигрышные числа: ")
    for (winerNumbers in lotteryNumbers)
        print("$winerNumbers ")

}