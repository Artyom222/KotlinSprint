package org.example.lesson_13

class Contact(
    val name: String,
    val phoneNumber: Long,
    val company: String?
)

fun main() {
    val contact = Contact("Alex", 89506484874, null)
}