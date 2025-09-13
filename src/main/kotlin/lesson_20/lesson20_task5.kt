package org.example.lesson_20

class Robot {
    val phraseList = listOf(
        "Добро пожаловать",
        "Здравствуйте",
        "Добрый вечер",
        "Приветствую",
        "С прибытием"
    )

    val normalModifier = { phrase: String ->
        phrase
    }
    val inversionModifier = { phrase: String ->
        phrase.reversed()
    }

    var nowModifier = normalModifier

    fun say() {
        val choiceNumber: Int = (0 until phraseList.size).random()
        val selectPhrase = phraseList[choiceNumber]
        println(nowModifier(selectPhrase))
    }

    fun setModifier(modifier: (String) -> String) {
        nowModifier = modifier
    }
}

fun main() {
    val robot = Robot()

    robot.say()
    robot.setModifier(robot.inversionModifier)
    robot.say()
    robot.setModifier(robot.normalModifier)
    robot.say()
}