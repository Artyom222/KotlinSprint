package org.example.lesson_14

class Chat(
    val messages: MutableList<Message> = mutableListOf<Message>(),

    ) {
    fun addMessage(author: String, message: String) {
        val newId = messages.size + 1
        val message = Message(newId, author, message)
        messages.add(message)
    }

    fun addThreadMessage(author: String, message: String, parentMessageId: Int) {
        val newId = messages.size + 1
        val message = ChildMessage(newId, author, message, parentMessageId)
        messages.add(message)
    }

    fun printChat() {
        val threadMessages = messages.filterIsInstance<ChildMessage>().groupBy { it.parentMessageId }
        messages.forEach { message ->
            if (message !is ChildMessage) {
                println("${message.author}: ${message.text} (id:${message.idMessage})")
                threadMessages[message.idMessage].let {
                    it?.forEach { threadMessage ->
                        println("\t ${threadMessage.author}: ${threadMessage.text} (id:${threadMessage.idMessage})")
                    }
                }
            }
        }
    }
}

open class Message(
    val idMessage: Int,
    val author: String,
    val text: String,
)

class ChildMessage(
    idMessage: Int,
    author: String,
    text: String,
    val parentMessageId: Int,
) : Message(idMessage, author, text)

fun main() {
    val chat = Chat()

    chat.addMessage("User1", "Привет!")
    chat.addMessage("User1", "Вы ходили вчра на концерт?")
    var parentMessageId = chat.messages.last().idMessage
    chat.addThreadMessage("User2", "Да, было круто", parentMessageId)
    chat.addThreadMessage("User3", "А вот я к сожалению не смог", parentMessageId)
    chat.addThreadMessage("User4", "Блин, он что вчера был?(", parentMessageId)
    chat.addMessage("User5", "Продам самокат")
    parentMessageId = chat.messages.last().idMessage
    chat.addThreadMessage("User3", "За сколько?", parentMessageId)

    chat.printChat()
}