package org.example.lesson_9

fun main() {
    print("Введите 5 ингредиентов, разделяя \",\": ")
    val input = readln()

    val ingredients = input.split(",")
    val sortIngredients = ingredients.sorted()

    println("Отсортированный список ингредиентов: ${sortIngredients.toString()}")
}