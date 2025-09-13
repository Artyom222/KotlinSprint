package org.example.lesson_20

class Player1(
    val name: String,
    var haveKey: Boolean,
)

fun main() {
    val max = Player1("Max", false)

    val tryOpenDoor: (Player1) -> String = { player: Player1 ->
        if (player.haveKey == true) {
            "Игрок открыл дверь"
        } else {
            "Дверь заперта"
        }
    }

    println(tryOpenDoor(max))
    max.haveKey = true
    println(tryOpenDoor(max))
}