package org.example.lesson_17

class Ship(
    name: String,
    val averageSpeed: Double,
    val homePort: String,
) {
    var name = name
        set(value) {
            println("Нельзя поменять имя корабля")
        }
}

fun main() {
    val ship = Ship("Titanik", 18.1, "K-101")
    ship.name = "Avrora"
}