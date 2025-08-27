package org.example.lesson_19

enum class Fishes {
    GUPPY,
    ANGELFISH,
    GOLDFISH,
    SIAMESE_FIGHTING_FISH,
}

fun main() {
    println("Пользователь может добавить следующих рыб:")
    for (i in Fishes.entries) println(i)

}