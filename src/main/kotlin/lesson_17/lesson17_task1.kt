package org.example.lesson_17

class QuizQuestion(
    question: String,
    answer: String,
) {
    val question = "В каком году было изобретено радио А. Поповым?"
        get() = field

    var answer =""
        get() = field
        set(value) {
            field = value
            if (value == "1895") {
                println("Правильный ответ!")
            } else {
                println("Неверный ответ")
            }
        }
}

fun main() {
    val question = QuizQuestion("В каком году было изобретено радио А. Поповым?", "")


    println("Вопрос: ${question.question}")
    question.answer = readln()
}