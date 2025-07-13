package org.example.lesson_9

fun main() {
    val ingredientsToPortion = listOf(2, 50, 15)
    print("Введите количество порций: ")
    val portions = readln().toInt()

    val totalIngredients = ingredientsToPortion.map { it * portions }

    println("На количество_порций ($portions), порций вам понадобится:")
    println("""
        яиц: ${totalIngredients[0]}шт.
        молока: ${totalIngredients[1]}мл.
        сливочного масла ${totalIngredients[2]}гр.
    """.trimIndent())
}