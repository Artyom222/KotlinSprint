package org.example.lesson_13

class PhoneBook(
    val name: String,
    val phoneNumber: Long,
    val company: String? = null
)

fun main() {
    val contact = PhoneBook("Alex", 89506484874)
}