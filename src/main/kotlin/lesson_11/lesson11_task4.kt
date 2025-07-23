package org.example.lesson_11

class Ingredient(
    val nameIngredient: String,
    val quantity: Int,
    val unit: String,
)

class Recipe(
    val nameRecipe: String,
    val category: Category,
    val ingredients: MutableList<Ingredient> = mutableListOf(),
    var isFavorite: Boolean = false,
) {
    fun shouRecipe() {
        print("Введите количество $nameRecipe: ")
        val quantity = readln().toInt()
        println("$nameRecipe в кол-ве $quantity шт. потребует:")
        ingredients.forEach {
            println("${it.nameIngredient}: ${it.quantity * quantity} ${it.unit}")
        }
    }
    fun addInFavorite() {
        isFavorite = true
        println("Добавлено в избранное!")
    }
}

class Category(
    val nameCategory: String,
    val recipes: MutableList<Recipe> = mutableListOf(),
)

fun main() {
    val burgerCategory = Category("Бургеры")

    val burger1 = Recipe("Классический Бургер", burgerCategory)
    val burger2 = Recipe("Бургер с грибами и сыром", burgerCategory)
    val burger3 = Recipe("Чизбургер", burgerCategory)

    val ingr1 = Ingredient("Булочка", 1, "шт")
    val ingr2 = Ingredient("Котлета", 1, "шт")
    val ingr3 = Ingredient("Лист салата", 2, "шт")
    val ingr4 = Ingredient("Слайс томата", 3, "шт")
    val ingr5 = Ingredient("Соус 1000 островов", 5, "гр")
    val ingr6 = Ingredient("Слайс соленегого огурца", 3, "шт")
    val ingr7 = Ingredient("Ломтик сыра", 2, "шт")
    val ingr8 = Ingredient("Кольца лука", 5, "шт")
    val ingr9 = Ingredient("Ломтик бекона", 2, "шт")
    val ingr10 = Ingredient("Измельченные грибы", 10, "гр")
    val ingr11 = Ingredient("Сливочный соус", 5, "гр")

    burger1.ingredients.addAll(listOf(ingr1, ingr2, ingr3, ingr4, ingr5))
    burger3.ingredients.addAll(listOf(ingr1, ingr2, ingr3, ingr6, ingr7, ingr8, ingr9))
    burger2.ingredients.addAll(listOf(ingr1, ingr2, ingr7, ingr9, ingr10, ingr11))

    burger1.shouRecipe()
    burger2.addInFavorite()

}