package org.example.lesson_13

class PhoneBook1(
val name: String,
val phoneNumber: Long,
val company: String? = null
) {
    fun printContact() {
        println("Имя: $name, Номер: $phoneNumber, Компания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact = PhoneBook1("Alex", 89506484874)
    contact.printContact()
}