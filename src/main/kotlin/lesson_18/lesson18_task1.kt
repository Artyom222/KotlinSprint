package org.example.lesson_18

class Order {
    fun printOrderInfo(
        orderNumber: Int,
        product: String,
    ) {
        println("Заказ №$orderNumber: \nЗаказан товар: $product")
    }

    fun printOrderInfo(
        orderNumber: Int,
        products: List<String>,
    ) {
        print("Заказ №$orderNumber: \nЗаказаны товары: ${products.joinToString()}")
    }
}

fun main() {
    val order1 = Order()
    val order2 = Order()

    order1.printOrderInfo(1, "картошка")
    order2.printOrderInfo(2, listOf("картошка", "томаты", "сыр"))

}