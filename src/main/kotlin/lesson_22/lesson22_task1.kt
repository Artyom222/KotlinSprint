package org.example.lesson_22

class RegularBook(
    val title: String,
    val author: String,
)

data class DataBook(
    val title: String,
    val author: String,
)

fun main() {
    val book1 = RegularBook("Преступление и наказание", "Достоевский")
    val book2 = RegularBook("Преступление и наказание", "Достоевский")
    val book3 = DataBook("Мастер и Маргарита", "Булгаков")
    val book4 = DataBook("Мастер и Маргарита", "Булгаков")

    println(book1 == book2) //сравниваются ссылки на объекты
    println(book3 == book4) //сравниваются значения полей
}