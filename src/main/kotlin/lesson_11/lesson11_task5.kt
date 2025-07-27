package org.example.lesson_11

class Forum {
    val users = mutableListOf<User>()
    val messages = mutableListOf<Message>()

    class User(
        val userId: Int,
        val userName: String,
    ) {
        class Builder(val forum: Forum) {
            fun build(userName: String): User {
                val newId = forum.users.size + 1
                val newUser = User(newId, userName)
                forum.users.add(newUser)
                return newUser
            }
        }
    }
    class Message(
        val authorId: Int,
        val message: String,
    ) {
        class Builder(val forum: Forum) {
            fun build(authorId: Int, message: String): Message? {
                if (forum.users.any { it.userId == authorId }) {
                    val newMessage = Message(authorId, message)
                    forum.messages.add(newMessage)
                    return newMessage
                }
                return null
            }
        }
    }

    fun createNewUser(userName: String): User {
        return User.Builder(this).build(userName)
    }

    fun createNewMessage(authorId: Int, message: String): Message? {
        return Message.Builder(this).build(authorId,message)
    }

    fun printThread() {
        messages.forEach { msg ->
            val authorName = users.find { it.userId == msg.authorId }?.userName
            println("$authorName: ${msg.message}")
        }
    }
}

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


