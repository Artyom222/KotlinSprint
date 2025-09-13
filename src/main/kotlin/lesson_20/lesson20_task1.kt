package org.example.lesson_20

fun main() {
    val splashScreen: (String) -> Unit = { userName: String ->
        println("С наступающим Новым Годом, $userName!")
    }

    splashScreen("Иван")
}