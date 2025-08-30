package org.example.lesson_19

class Tank(
    val model: String,
    val mass: Int,
    val maxSpeed: Int,
    val armorThickness: Int,
    var tankAmmo: Ammo? = null,
) {
    fun shot() {
        if (tankAmmo != null) {
            println("Выстрел снарядом ${tankAmmo!!.color}.\nНанесено ${tankAmmo!!.damage} урона")
        } else {
            println("Ошибка! Нет снаряда!")
        }
    }

    fun equipAmmo(ammo: Ammo) {
        println("Вы подобрали снаряд: ${ammo.color}")
        tankAmmo = ammo
    }
}

enum class Ammo(
    val damage: Int,
    val color: String,
) {
    BLUE(5, "синий"),
    GREEN(10, "зеленый"),
    RED(20, "красный");
}

fun main() {
    val tank = Tank("T-90", 3000, 25, 30)

    tank.shot()
    tank.equipAmmo(Ammo.BLUE)
    tank.shot()
    tank.equipAmmo(Ammo.RED)
    tank.shot()
}