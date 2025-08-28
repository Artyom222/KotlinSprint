package org.example.lesson_19

enum class ProductCategory(val categoryId: Int) {
    CLOTHING(1),
    STATIONERY(2),
    MISCELLANEOUS(3),
    ERROR(0);

    companion object {
        fun getName(categoryId: Int): String {
            return when (categoryId) {
                CLOTHING.categoryId -> "Одежда"
                STATIONERY.categoryId -> "Канцелярские товары"
                MISCELLANEOUS.categoryId -> "Разное"
                else -> "Ошибка"
            }
        }
    }
}

class Product(
    val name: String,
    val id: Int,
    val categoryId: Int,
) {
    fun getInfo() {
        println("Имя: $name, id: $id, категория: ${ProductCategory.getName(categoryId)}")
    }
}

fun main() {
    val shirt = Product("Рубашка", 1, 1)
    val jacket = Product("Жакет", 2, 1)
    val scissors = Product("Ножницы", 3, 2)
    val candle = Product("Свеча", 4, 3)

    shirt.getInfo()
    jacket.getInfo()
    scissors.getInfo()
    candle.getInfo()
}