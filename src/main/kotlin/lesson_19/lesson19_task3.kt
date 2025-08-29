package org.example.lesson_19

class SpaceShip {
    fun takeOff() {
        println("Космический корабль взлетает")
        // TODO: Реализовать логику взлета с проверкой топлива и систем
    }

    fun shootAsteroid() {
        println("Космический корабль отстреливается от астероида")
        // TODO: Добавить логику выбора оружия и перезарядки
        println("Выстрел произведен!")
    }

    fun land() {
        println("Космический корабль приземляется")
        throw NotImplementedError("Метод land() еще не реализован")
    }
}

fun main() {
    val ship = SpaceShip()

    ship.takeOff()
    ship.shootAsteroid()
    ship.land()
}