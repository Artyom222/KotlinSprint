package org.example.lesson_21

fun String.vowelCount(): Int {
    val vowels = setOf('a','e','i','o','u','y','A','E','I','O','U','Y')
    return this.count { it in vowels}
}

fun main() {
    println("Hello".vowelCount())
    println("Extensions".vowelCount())
}