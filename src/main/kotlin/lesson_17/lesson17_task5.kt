package org.example.lesson_17

class User(
    login: String,
    userPassword: String,
) {
    private val realPassword = userPassword
    var password: String
        get() = "*".repeat(realPassword.length)
        set(value) {
            println("Вы не можете изменить пароль")
        }

    var login = login
        set(value) {
            field = value
            println("Логин успешно изменен на: $value")
        }
}

fun main() {
    val user1 = User("Alex", "456456456")

    println(user1.password)
    user1.password = "789789"

    user1.login = "Max"
    println(user1.login)

}