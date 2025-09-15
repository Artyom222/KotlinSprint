package org.example.lesson_20

fun main() {
    val items = listOf<String>("Меню", "Настройки", "Поиск", "Контакты", "О нас")

    val listLambda = items.map { item ->
        { println("Нажат элемент [$item]") }
    }

    listLambda.forEachIndexed { index, lambda ->
        if ((index + 1) % 2 == 0) {
            lambda()
        }
    }
}