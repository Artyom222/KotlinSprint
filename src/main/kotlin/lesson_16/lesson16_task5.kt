package org.example.lesson_16

class Player(
    private val name: String,
    private val maxHp: Int,
    private var attackPower: Int,
) {
    private var health = maxHp
    private var canHeal = true

    fun takeDamage(damage: Int) {
        health -= damage
        if (health <= 0) { health = 0 }
        println("Получено $damage урона. Осталось $health ХП")
        if (health == 0) {die()}
    }

    fun heal(amount: Int) {
        if (canHeal) {
            health += amount
            if (health >= maxHp) {health = maxHp}
            println("Востановлено $amount ХП. Осталось $health ХП")
        }
    }

    private fun die() {
        attackPower = 0
        canHeal = false
        println("Персонаж погиб.")
    }
}

fun main() {
    val player = Player("Morty", 30, 5)

    player.heal(5)
    player.takeDamage(15)
    player.takeDamage(5)
    player.heal(5)
    player.takeDamage(30)
}