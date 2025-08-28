package org.example.lesson_19

enum class Fishes(val fishName: String) {
    GUPPY("гуппи"),
    ANGELFISH("скалярия"),
    GOLDFISH("золотая рыбка"),
    SIAMESE_FIGHTING_FISH("петушок"),
}

fun main() {
    println("Пользователь может добавить следующих рыб:")
    for (i in Fishes.entries) println(i.fishName)
}