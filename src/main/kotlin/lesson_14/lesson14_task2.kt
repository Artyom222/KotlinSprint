package org.example.lesson_14

open class Liner1(
    val name: String,
    open val maxSpeed: Int = 30,
    open val capacity: Int = 1000,
    open val loadCapacity: Int = 200,
    open val canBreakIce: Boolean = false,
) {
    open fun loadCargo() {
        println("Лайнер выдвигает горизонтальный трап со шкафута")
    }

    fun printInformation() {
        println(
            """
            Класс корабля: ${this::class.simpleName}
            Имя корабля: $name
            Максимальная скорость: $maxSpeed
            Количество пассажиров: $capacity
            Грузоподьемность: $loadCapacity
            Способность ломать лёд: $canBreakIce
            
        """.trimIndent()
        )
    }
}

class CargoShip1(
    name: String,
    override val maxSpeed: Int = 15,
    override val capacity: Int = 100,
    override val loadCapacity: Int = 1000,
    override val canBreakIce: Boolean = false,
) : Liner1(name) {
    override fun loadCargo() {
        println("Грузовой корабль активирует погрузочный кран")
    }
}

class Icebreaker1(
    name: String,
    override val maxSpeed: Int = 15,
    override val capacity: Int = 100,
    override val loadCapacity: Int = 100,
    override val canBreakIce: Boolean = true,
) : Liner1(name) {
    override fun loadCargo() {
        println("Ледокол открывает ворота со стороны кормы")
    }
}

fun main() {
    val liner = Liner1("Титаник")
    val cargo = CargoShip1("Восток")
    val iceBreaker = Icebreaker1("Полярный")

    liner.loadCargo()
    cargo.loadCargo()
    iceBreaker.loadCargo()
    println()

    liner.printInformation()
    cargo.printInformation()
    iceBreaker.printInformation()
}