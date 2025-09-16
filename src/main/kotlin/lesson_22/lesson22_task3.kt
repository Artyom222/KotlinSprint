package org.example.lesson_22

data class Player3(
    val name: String,
    val maxHealth: Int,
    var nowHealth: Int,
)

fun main() {
    val player3 = Player3("Max100",120,80)
    val (name,maxHealth,nowHealth) = player3

    println(player3)
    println(name)
    println(maxHealth)
    println(nowHealth)
}