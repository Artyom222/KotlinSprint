package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("яйца", "лук", "чеснок", "картофель", "курица", "индейка", "говядина", "макароны")
    print("Какой ингридиент найти? ")
    val searchIngredient = readln()
    var isSuccess = false

    for (i in ingredients.indices) {
        if (searchIngredient == ingredients[i]) {
            println("Ингредиент ${ingredients[i]} в рецепте есть")
            isSuccess = true
            break
        }
    }
    if (!isSuccess) {
        println("Такого ингредиента в рецепте нет")
    }

}