package org.example.lesson_11

class User3(
    val userId: Int,
    val userName: String,
    val userImage: String,
    var userStatus: String,
) {}

class VoiceRoom(
    val roomName: String,
    val roomImage: String,
    val userList: MutableList<User3> = mutableListOf()
) {
    fun addUser(user: User3) {
        userList.add(user)
        println("Пользователь ${user.userName} добавлен в комнату $roomName")
    }

    fun updateUserStatus(userId: Int, newUserStatus: String) {

        val user = userList.find { it.userId == userId }
        user?.userStatus = newUserStatus
    }

    fun printRoomInformation() {
        println(
            """
            Информация о комнате:
            Имя: $roomName
            Обложка: $roomImage
            Участники:
        """.trimIndent()
        )

        userList.forEach {
            println(
                """
                ID: ${it.userId}
                Имя: ${it.userName}
                Аватар: ${it.userImage}
                Статус: ${it.userStatus}
        """.trimIndent()
            )
        }
    }
}

fun main() {
    val user1 = User3(1, "Jon", "img1.png", "микрофон выключен")
    val user2 = User3(2, "Bill", "img2.png", "разговаривает")
    val user3 = User3(3, "Kelvin", "img3.png", "микрофон выключен")

    val room = VoiceRoom("GameZone", "roomImg1.png")

    room.addUser(user1)
    room.addUser(user2)
    room.printRoomInformation()

    room.addUser(user3)
    room.updateUserStatus(2,"пользователь заглушен")
    room.printRoomInformation()

}