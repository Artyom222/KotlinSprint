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
            field = value
        }
}

fun main() {
    val question = QuizQuestion("В каком году было изобретено радио А. Поповым?", "1895")

    println("Вопрос: ${question.question}")
    println("Ответ: ${question.answer}")
    question.answer = readln()
    println("Ответ: ${question.answer}")
}