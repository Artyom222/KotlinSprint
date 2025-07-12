package org.example.lesson_8

fun main() {
    print("Сколько будет ингредиентов? ")
    val ingredientCount = readln().toInt()

    val ingredients = Array<String>(ingredientCount) { "" }

    for (i in ingredients.indices) {
        print("Введите ингредиент №${i + 1}: ")
        ingredients[i] = readln()
    }
    println("Ваш набор ингредиентов: ${ingredients.contentToString()}")

}