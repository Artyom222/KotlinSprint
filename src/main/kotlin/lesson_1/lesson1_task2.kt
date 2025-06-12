package org.example.lesson_1

val numberOfOrder: Int = 75
val thanksText:String = "Благодарим за покупку!"

fun main(){
    println("Количество заказов: $numberOfOrder")
    println(thanksText)

    var numberOfWorkers = 2000
//    println("Количество работников: $numberOfWorkers")
    numberOfWorkers = numberOfWorkers - 1
    println("Количество работников: $numberOfWorkers")

}