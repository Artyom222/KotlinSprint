package lesson_2

import kotlin.math.pow

const val PERCENTAGE_TO_FRACTION = 100

fun main() {
    val interestRate = 16.7
    val initialAmount = 70_000
    val durationOFDepositYear = 20
    //A = P × (1 + r)^t
    val finalAmount = initialAmount * (1 + interestRate / PERCENTAGE_TO_FRACTION).pow(durationOFDepositYear)
    println("Сумма вклада через $durationOFDepositYear лет: %.3f".format(finalAmount))

}