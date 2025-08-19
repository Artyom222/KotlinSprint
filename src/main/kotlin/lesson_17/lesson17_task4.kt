package org.example.lesson_17

class Package(
    val number: String,
    initialLocation: String,
) {
    private var moveCount = 0
    var location = initialLocation
        set(value) {
            field = value
            moveCount++
        }

    fun printInfo() {
        println(
            """
            Посылка №$number
            Текущее местоположение: $location
            Количество перемещений: $moveCount
        """.trimIndent()
        )
    }
}

fun main() {
    val package1 = Package("865126", "Москва")

    package1.location = "Казань"
    package1.location = "Омск"
    package1.printInfo()
}

