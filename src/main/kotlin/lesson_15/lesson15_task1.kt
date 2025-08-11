package org.example.lesson_15

interface Swimmable {
    fun swim()
}

interface Flyable {
    fun fly()
}

class Crucian : Swimmable {
    override fun swim() {
        println("Карась плавает")
    }
}

class Seagull : Flyable, Swimmable {
    override fun fly() {
        println("Чайка летает")
    }

    override fun swim() {
        println("Чайка плавает")
    }
}

class Duck : Flyable, Swimmable {
    override fun fly() {
        println("Утка летает")
    }

    override fun swim() {
        println("Утка плавает")
    }
}

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