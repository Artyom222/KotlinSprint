package org.example.lesson_21

class Player(
    val name: String,
    val maxHealth: Int,
    var nowHealth: Int,
)

fun Player.isHealthy(): Boolean {
    return this.maxHealth == this.nowHealth
}

fun main() {
    val player1 = Player("Max100", 120, 120)
    val player2 = Player("СаняНагибатор", 120, 80)

    println(player1.isHealthy())
    println(player2.isHealthy())
}