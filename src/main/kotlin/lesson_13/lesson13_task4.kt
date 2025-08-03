package org.example.lesson_13

class PhoneContact1(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
) {
    fun printContact() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    val phoneBook = mutableListOf<PhoneContact1>()
    var more = "да"

    while (more == "да") {
        inputContact(phoneBook)
        print("Продолжить ввод контактов? (да/нет)")
        more = readln()
    }
    println("//-----------------//")
    phoneBook.forEach { it.printContact() }
}

fun inputContact(phoneBook: MutableList<PhoneContact1>) {
    print("Введите имя контакта: ")
    val nameContact = readln()

    print("Введите номер телефона контакта: ")
    val phoneContact = readln().toLongOrNull()

    print("Введите название компании: ")
    var companyContact: String? = readln()
    if (companyContact == "") {
        companyContact = null
    }

    if (phoneContact != null) {
        val newContact = PhoneContact1(nameContact, phoneContact, companyContact)
        phoneBook.add(newContact)
    } else {
        println("Номер телефона не введен. Котакт не будет создан")
    }
}