package lesson_2

import kotlin.math.pow

const val PERCENTAGE_TO_FRACTION = 100

fun main() {
    val interestRate = 16.7
    val initialAmount = 70_000
    val durationOfDepositYear = 20
    val finalAmount = initialAmount * (1 + interestRate / PERCENTAGE_TO_FRACTION).pow(durationOfDepositYear)
    println("Сумма вклада через $durationOfDepositYear лет: %.3f".format(finalAmount))

}