package org.example.lesson_16

class Order(
    private val orderNumber: String,
    private var orderStatus: String,
) {
    private fun changeStatus(newStatus: String) {
        orderStatus = newStatus
    }

    fun requestOrderStatusChange(newStatus: String) {
        changeStatus(newStatus)
        println("Статус заказа изменен на \"$newStatus\"")
    }
}

fun main() {
    val order = Order("8845665", "Заказ собирается")

    order.requestOrderStatusChange("Заказ в пути")
}