package org.example.lesson_20

class Robot {
    private val phrases = listOf(
        "Добро пожаловать",
        "Здравствуйте",
        "Добрый вечер",
        "Приветствую",
        "С прибытием"
    )

    private var modifier: (String) -> String = { it }

    fun say() {
        val selectPhrase = phrases.random()
        println(modifier(selectPhrase))
    }

    fun setModifier(modifier: (String) -> String) {
        this.modifier = modifier
    }
}

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier({ it.reversed() })
    robot.say()
}