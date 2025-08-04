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
        PhoneContact("Gleb", 848684666, "MTS"),
        PhoneContact("Bill", 68646532),
        PhoneContact("Genadiy", 9468468455126),
        PhoneContact("ElBek", 789845264646, "MTS"),
    )
    val companys = (phoneBook.mapNotNull { it.company }).distinct()

    println("Список всех компаний: $companys")
}