package org.example.lesson_6

fun main() {
    var attemptCount = 3
    var isBot = true
    var numbers: List<Int>
    var answer: Int
    println("Подтвердите, что вы не робот")

    while (isBot && attemptCount > 0) {
        numbers = List(2) {(0..9).random()}
        print("Решите пример ${numbers[0]} + ${numbers[1]} = ")
        answer = readln().toInt()
        --attemptCount
        if (answer == (numbers[0] + numbers[1])) {
            isBot = false
            println("Доступ открыт")
        } else if (attemptCount != 0) {
            println("Неверно. Попробуйте еще раз")
        } else {
            println("Доступ закрыт!")
        }
    }

}