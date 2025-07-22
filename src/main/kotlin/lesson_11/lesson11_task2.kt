package org.example.lesson_11

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String? = null,
) {
    fun printUserInfo() {
        println("""
        Информация о пользователе
        id: $id
        login: $login
        password: $password
        email: $email
        О себе: $bio
    """.trimIndent())
    }

    fun setBioFromConsole() {
        println("Введите информацию о себе")
        this.bio = readln()
    }

    fun changePassword() {
        print("Введите текущий пароль: ")
        val nowPassword = readln()

        if (nowPassword == this.password) {
            print("Введите новый пароль: ")
            this.password = readln()
            println("Пароль успешно изменен")
        }
    }
}

fun main() {
    val user = User2(
        1,
        "Oleg",
        "qwerty",
        "123@mail.ru"
    )

    user.setBioFromConsole()
    user.changePassword()
    user.printUserInfo()

}
