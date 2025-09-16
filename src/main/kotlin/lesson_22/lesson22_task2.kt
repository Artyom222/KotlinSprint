package org.example.lesson_22

class RegularBook1(
    val title: String,
    val author: String,
)

data class DataBook1(
    val title: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook1("Преступление и наказание", "Достоевский")
    val book2 = DataBook1("Мастер и Маргарита", "Булгаков")

    println(book1) //вывод стандартного класса
    println(book2) //вывод дата класса
}