package org.example.lesson_11

class User(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user1 = User(
        id = 1,
        login = "Oleg",
        password = "qwerty!",
        email = "123@mail.ru"
    )

    val user2 = User(
        id = 2,
        login = "Pro100",
        password = "123321",
        email = "sfnjn@mail.ru"
    )

    println("""
        Данные user1
        id: ${user1.id}
        login: ${user1.login}
        password: ${user1.password}
        email: ${user1.email}
    """.trimIndent())

    println()
    println("""
        Данные user2
        id: ${user2.id}
        login: ${user2.login}
        password: ${user2.password}
        email: ${user2.email}
    """.trimIndent())

}