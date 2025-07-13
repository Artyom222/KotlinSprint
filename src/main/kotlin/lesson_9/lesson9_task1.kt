package org.example.lesson_9

fun main() {
    val ingredients = listOf("яйца", "лук", "чеснок", "картофель", "курица", "индейка", "говядина", "макароны")
    println("В рецепте есть следующие ингредиенты: ${ingredients.toString()}")

    ingredients.forEach {
        println(it)
    }
}