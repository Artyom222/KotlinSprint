package org.example.lesson_11

class User4(
    val id: Int,
    val login: String,
    val password: String,
    val email: String,
)

fun main() {
    val user41 = User4(
        id = 1,
        login = "Oleg",
        password = "qwerty!",
        email = "123@mail.ru"
    )

    val user42 = User4(
        id = 2,
        login = "Pro100",
        password = "123321",
        email = "sfnjn@mail.ru"
    )

    println("""
        Данные user1
        id: ${user41.id}
        login: ${user41.login}
        password: ${user41.password}
        email: ${user41.email}
    """.trimIndent())

    println()
    println("""
        Данные user2
        id: ${user42.id}
        login: ${user42.login}
        password: ${user42.password}
        email: ${user42.email}
    """.trimIndent())

}