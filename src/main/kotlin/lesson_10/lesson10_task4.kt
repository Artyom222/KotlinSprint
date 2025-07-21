package org.example.lesson_10

fun main() {
    var isEnd: String
    var humanWins = 0
    var computerWins = 0
    var draw = 0

    do {
        println("Ход игрока:")
        val humanPoint = rollDice()

        println("Ход компьютера:")
        val computerPoint = rollDice()

        val result = resultGame(humanPoint, computerPoint)
        when (result) {
            "human" -> humanWins++
            "computer" -> computerWins++
            "draw" -> draw++
        }

        println("Хотите провести еще раунд?")
        isEnd = readln()

    } while (isEnd.equals("да", true))

    println(
        """
        Результат сессии
        Человечество выиграло: $humanWins
        Компьютер выиграл: $computerWins
        Ничья: $draw
    """.trimIndent()
    )

}

fun rollDice(): Int {
    val number = (1..6).random()
    println("На кубике выпало число $number")
    return number
}

fun resultGame(humanPoint: Int, computerPoint: Int): String {
    return when {
        humanPoint > computerPoint -> {
            println("Победило человечество")
            "human"
        }

        humanPoint < computerPoint -> {
            println("Победила машина")
            "computer"
        }

        else -> {
            println("Победила дружба")
            "draw"
        }
    }

}