package org.example.lesson_20

class Player(
    val name: String,
    val maxHealth: Int,
    var nowHealth: Int,
)

fun main() {
    val max = Player("Max", 120,80)

    val healingPotionToMax: (Player) -> Unit = { player: Player ->
        player.nowHealth = player.maxHealth
        println("Здоровье игрока востановлено до ${player.nowHealth} хп")
    }

    healingPotionToMax(max)
}