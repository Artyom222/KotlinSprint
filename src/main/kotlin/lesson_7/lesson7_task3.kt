package org.example.lesson_7

fun main() {
    print("Введите число: ")
    val number = readln().toInt()

    for (i in 0..number step 2) {
        print("$i ")
    }
}