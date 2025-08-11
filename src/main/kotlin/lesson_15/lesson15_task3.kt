package org.example.lesson_15

abstract class ForumUser(
    val userName: String,
) {
    fun readForum() {
        println("$userName читает форум")
    }

    fun writeMessage() {
        println("$userName пишет сообщение")
    }
}

class RegularUser(
    userName: String,
) : ForumUser(userName)

class AdminUser(
    userName: String,
) : ForumUser(userName) {

    fun deleteMessage() {
        println("Администратор $userName удалил сообщение ")
    }

    fun banUser() {
        println("Администратор $userName заблокировал пользователя")
    }
}

fun main() {
    val regularUser = RegularUser("Иван")
    val admin = AdminUser("Димон")

    regularUser.writeMessage()
    regularUser.readForum()

    admin.readForum()
    admin.deleteMessage()
    admin.banUser()
}