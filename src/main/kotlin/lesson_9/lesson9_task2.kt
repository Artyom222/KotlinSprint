package org.example.lesson_9

fun main() {
    val baseListIngredients = mutableListOf("яйцо", "сыр", "колбаса")
    println("В рецепте есть базовые ингредиенты: ${baseListIngredients.toString()}")

    println("Желаете добавить еще?")
    val answer = readln()

    if (answer.equals("да", true )) {
        println("Какой ингредиент вы хотите добавить?")
        val newIngredient = readln()
        baseListIngredients.add(newIngredient)
        println("Теперь в рецепте есть следующие ингредиенты: ${baseListIngredients.toString()}")
    }
}
