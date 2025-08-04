package org.example.lesson_13

class PhoneContact2(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null,
) {
    fun printContact() {
        println("Имя: $name \nНомер: $phoneNumber \nКомпания: ${company ?: "<не указано>"}\n")
    }
}

fun main() {
    val contact = inputContact()
    contact?.printContact()
}

fun inputContact(): PhoneContact2? {
    print("Введите имя контакта: ")
    val nameContact = readln()

    print("Введите номер телефона контакта: ")
    val phoneInput = readln()
    val phoneContact = try {
        phoneInput.toLong()
    } catch (e: NumberFormatException) {
        println("Ошибка: ${e.javaClass.simpleName} - введены некорректные данные для номера телефона")
        return null
    }

    print("Введите название компании: ")
    var companyContact: String? = readln()
    if (companyContact == "") {
        companyContact = null
    }

    return PhoneContact2(nameContact, phoneContact.toLong(), companyContact)

}