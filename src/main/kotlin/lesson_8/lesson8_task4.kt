package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("яйца", "лук", "чеснок", "картофель", "курица", "индейка", "говядина", "макароны")
    println(ingredients.contentToString())

    print("Какой ингридиент вы хотите заменить? ")
    val editIngredient = readln()
    val index = ingredients.indexOf(editIngredient)

    if (index != -1) {
        print("Какой ингридиент вы хотите добавить? ")
        ingredients[index] = readln()
        println("Готово! Вы сохранили следующий список: ${ingredients.contentToString()}")
    } else {
        println("Такого ингредиента нет")
    }
}