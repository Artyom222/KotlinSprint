package org.example.lesson_13

class Contact1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "<не указано>"}")
    }
}

fun main() {
    val contact = Contact1("Alex", 89506484874)
    contact.printContact()
}