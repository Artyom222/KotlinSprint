package org.example.lesson_11

class Forum {
    val users = mutableListOf<User>()
    val messages = mutableListOf<Message>()

    fun createNewUser(userName: String): User {
        val newId = users.size + 1
        val newUser = User(newId, userName)
        users.add(newUser)
        return newUser
    }

    fun createNewMessage(authorId: Int, message: String): Message? {
        if (users.any { it.userId == authorId }) {
            val newMessage = Message(authorId, message)
            messages.add(newMessage)
            return newMessage
        }
        return null
    }

    fun printThread() {
        messages.forEach { msg ->
            val authorName = users.find { it.userId == msg.authorId }?.userName
            println("$authorName: ${msg.message}")
        }
    }
}

class User(
    val userId: Int,
    val userName: String,
) {}

class Message(
    val authorId: Int,
    val message: String,
) {}

fun main() {
    val forum = Forum()

    val user1 = forum.createNewUser("Alex")
    val user2 = forum.createNewUser("Bill")

    forum.createNewMessage(user1.userId, "Привет!")
    forum.createNewMessage(user2.userId, "Привет, Alex")
    forum.createNewMessage(user1.userId, "Как дела?")
    forum.createNewMessage(user2.userId, "Нормально")

    forum.printThread()
}