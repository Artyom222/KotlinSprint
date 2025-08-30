package org.example.lesson_19

enum class ProductCategory() {
    CLOTHING,
    STATIONERY,
    MISCELLANEOUS,
    ERROR;

    fun getCategoryName() = when(this) {
        CLOTHING -> "Одежда"
        STATIONERY -> "Канцелярские товары"
        MISCELLANEOUS -> "Разное"
        ERROR -> "Ошибка"
    }
}

class Product(
    val name: String,
    val id: Int,
    val category: ProductCategory,
) {
    fun getInfo() {
        println("Имя: $name, id: $id, категория: ${category.getCategoryName()}")
    }
}

fun main() {
    val shirt = Product("Рубашка", 1, ProductCategory.CLOTHING)
    val jacket = Product("Жакет", 2, ProductCategory.CLOTHING)
    val scissors = Product("Ножницы", 3, ProductCategory.STATIONERY)
    val candle = Product("Свеча", 4, ProductCategory.MISCELLANEOUS)

    shirt.getInfo()
    jacket.getInfo()
    scissors.getInfo()
    candle.getInfo()
}