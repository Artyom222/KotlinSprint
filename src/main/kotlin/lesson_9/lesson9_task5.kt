package org.example.lesson_9

fun main() {
    val ingredients = mutableSetOf<String>()
    val ingredientsCount = 5

    println("Введите $ingredientsCount ингредиентов")
    for (i in 0 until ingredientsCount) {
        print("Введите ингредиент №${i + 1}: ")
        ingredients.add(readln())
    }

    val ingredientsSorted = ingredients.sorted()
    var output = ingredientsSorted.joinToString()
    output = output.replaceFirstChar { it.uppercase() }
    println(output)

}