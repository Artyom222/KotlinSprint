package org.example.lesson_15

interface Swimmable {
    fun swim() {
        println("${javaClass.simpleName}: Я могу плавать!")
    }
}

interface Flyable {
    fun fly() {
        println("${javaClass.simpleName}: Я могу летать!")
    }
}

class Crucian : Swimmable

class Seagull : Flyable, Swimmable

class Duck : Flyable, Swimmable

fun main() {
    val crucian = Crucian()
    val seagull = Seagull()
    val duck = Duck()

    crucian.swim()
    seagull.swim()
    seagull.fly()
    duck.fly()
    duck.swim()

}




