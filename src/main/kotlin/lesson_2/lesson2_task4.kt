package lesson_2

fun main() {
    val buffOnLoot = 0.2
    val minedCrystalOre = 7
    val minedIronOre = 11
    val bonusCrystalOre = minedCrystalOre * buffOnLoot
    val bonusIronOre = minedIronOre * buffOnLoot

    println("Бонусная кристаллическая руда:${bonusCrystalOre.toInt()}")
    println("Бонусная железная руда:${bonusIronOre.toInt()}")

}