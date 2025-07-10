package org.example.lesson_8

fun main() {
    val ingredients = arrayOf("яйца", "лук", "чеснок", "картофель", "курица", "индейка", "говядина", "макароны")
    println(ingredients.contentToString())

    print("Какой ингридиент вы хотите заменить? ")
    val editIngredient = readln()

    if (editIngredient in ingredients) {
        print("Какой ингридиент вы хотите добавить? ")
        val newIngredient = readln()
        ingredients[ingredients.indexOf(editIngredient)] = newIngredient
        println("Готово! Вы сохранили следующий список: ${ingredients.contentToString()}")
    } else {
        println("Такого ингредиента нет")
    }

}