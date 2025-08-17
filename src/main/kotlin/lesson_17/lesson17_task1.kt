package org.example.lesson_17

class QuizQuestion(
    question: String,
    answer: String,
) {
    val question = question
        get() = field

    var answer = answer
        get() = field
        set(value) {
            if (value == field) {
                println("Правильный ответ!")
            } else {
                println("Неверный ответ")
            }
        }
}

fun main() {
    val question = QuizQuestion("В каком году было изобретено радио А. Поповым?", "1895")

    println("Вопрос: ${question.question}")
    question.answer = readln()
}