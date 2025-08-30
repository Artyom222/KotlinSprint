package org.example.lesson_19

const val NUMBER_OF_PEOPLE = 5

class Human(
    val name: String,
    val gender: Gender,
)

enum class Gender(val translate: String) {
    MALE("мужской"),
    FEMALE("женский"),
}

fun main() {
    val listOfPeople = mutableListOf<Human>()

    println("Введите имя и пол человека. Имя с большой буквы.\nПол может быть:\"мужской\" и \"женский\"")

    var countOfPeople = 0
    while (countOfPeople < NUMBER_OF_PEOPLE) {
        print("Имя:")
        val name = readln()
        print("Пол:")
        val gender: Gender = when (readln()) {
            "мужской" -> Gender.MALE
            "женский" -> Gender.FEMALE
            else -> {
                println("Такого пола нет, введите заново")
                continue
            }
        }
        listOfPeople.add(Human(name, gender))
        countOfPeople++
    }

    println("---Картотека---")
    listOfPeople.forEach {
        println("Имя: ${it.name} пол: ${it.gender.translate}")
    }
}