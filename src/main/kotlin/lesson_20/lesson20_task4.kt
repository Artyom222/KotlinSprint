package org.example.lesson_20

fun main() {
    val listString = listOf<String>("Меню","Настройки","Поиск","Контакты","О нас")

    val listLambda = listString.map { item->
        { println("Нажат элемент [$item]") }
    }

    listLambda.forEachIndexed { index, lambda ->
        if (index % 2 == 0) {
            lambda()
        }
    }
}