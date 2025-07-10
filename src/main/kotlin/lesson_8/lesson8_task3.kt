package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("яйца", "лук", "чеснок", "картофель", "курица", "индейка", "говядина", "макароны")
    print("Какой ингридиент найти? ")
    val searchIngredient = readln()

    if (searchIngredient in ingredients) {
        println("Ингредиент $searchIngredient в рецепте есть")
    } else {
        println("Такого ингредиента в рецепте нет")
    }

}