package org.example.lesson_21

import java.io.File

fun File.writeFirstWord(word: String) {
    val currentContent = this.readText()
    this.writeText("${word.lowercase()} $currentContent")
}

fun main() {
    val file = File("word.txt")

    file.createNewFile()
    file.writeText("world!")
    file.writeFirstWord("Hello")

    println(file.readText())
}