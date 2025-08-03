package org.example.lesson_13

class PhoneContact(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    val phoneBook = listOf<PhoneContact>(
        PhoneContact("Alex", 8684646, "null"),
        PhoneContact("Gleb", 848684666, "google"),
        PhoneContact("Bill", 68646532),
        PhoneContact("Genadiy", 9468468455126),
        PhoneContact("ElBek", 789845264646, "MTS"),
    )
    println("Список всех компаний: ${phoneBook.map { it.company }}")
}