package org.example.lesson_18

abstract class Tamagotchi {
    abstract val name: String
    abstract val meal: String
    abstract fun eat()
}

class Dog() : Tamagotchi() {
    override val name: String = "Собака"
    override val meal: String = "кость"

    override fun eat() {
        println("$name ест $meal")
    }
}

class Cat() : Tamagotchi() {
    override val name: String = "Кошка"
    override val meal: String = "рыба"

    override fun eat() {
        println("$name ест $meal")
    }
}

class Fox() : Tamagotchi() {
    override val name: String = "Лиса"
    override val meal: String = "ягоды"

    override fun eat() {
        println("$name ест $meal")
    }
}

fun main() {
    val dog: Tamagotchi = Dog()
    val cat: Tamagotchi = Cat()
    val fox: Tamagotchi = Fox()

    val animals = listOf<Tamagotchi>(dog, cat, fox)

    animals.forEach { it.eat() }
}