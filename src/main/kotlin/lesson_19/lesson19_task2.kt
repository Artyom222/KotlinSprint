package org.example.lesson_19

enum class ProductCategory {
    CLOTHING {
        override fun getName(): String = "Одежда"
    },
    STATIONERY {
        override fun getName(): String = "Канцелярские товары"
    },
    MISCELLANEOUS {
        override fun getName(): String = "Разное"
    },
    ERROR {
        override fun getName(): String = "Ошибка"
    };

    abstract fun getName(): String
}

class Product(
    val name: String,
    val id: Int,
    val categoryId: Int,
) {
    fun getInfo() {
        println("Имя: $name, id: $id, категория: ${identifyCategory(categoryId)}")
    }

    fun identifyCategory(categoryId: Int): String {
        return when (categoryId) {
            1 -> ProductCategory.CLOTHING.getName()
            2 -> ProductCategory.STATIONERY.getName()
            3 -> ProductCategory.MISCELLANEOUS.getName()
            else -> ProductCategory.ERROR.getName()
        }
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