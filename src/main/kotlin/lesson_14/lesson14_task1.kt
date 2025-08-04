package org.example.lesson_14

open class Liner(
    val name: String,
    open val maxSpeed: Int = 30,
    open val capacity: Int = 1000,
    open val loadCapacity: Int = 200,
    open val canBreakIce: Boolean = false
    )

class CargoShip(
    name: String,
    override val maxSpeed: Int = 15,
    override val capacity: Int = 100,
    override val loadCapacity: Int = 1000,
    override val canBreakIce: Boolean = false
): Liner(name)

class Icebreaker(
    name: String,
    override val maxSpeed: Int = 15,
    override val capacity: Int = 100,
    override val loadCapacity: Int = 100,
    override val canBreakIce: Boolean = true
): Liner(name)

fun main() {
    val liner = Liner("Титаник")
    val cargo = CargoShip("Восток")
    val iceBreaker = Icebreaker("Полярный")

}