package lesson_2

const val PERCENTAGE_IN_FRACTIONS = 100

fun main() {
    val buffOnLoot = 20
    val minedCrystalOre = 7
    val minedIronOre = 11
    val bonusCrystalOre = minedCrystalOre * buffOnLoot / PERCENTAGE_IN_FRACTIONS
    val bonusIronOre = minedIronOre * buffOnLoot / PERCENTAGE_IN_FRACTIONS

    println("Бонусная кристаллическая руда:${bonusCrystalOre}")
    println("Бонусная железная руда:${bonusIronOre}")

}