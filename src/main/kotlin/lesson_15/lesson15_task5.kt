package org.example.lesson_15

interface Movable {
    fun move()
}

interface PassengerTransport {
    fun loadPassengers(count: Int)
    fun unloadPassengers()
}

interface CargoTransport {
    fun loadCargo(weight: Double)
    fun unloadCargo()
}

class Truck(
    val maxPassengers: Int = 1,
    var currentPassengers: Int = 0,
    val maxCargo: Double = 2.0,
    var currentCargo: Double = 0.0,
) : Movable, PassengerTransport, CargoTransport {

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Посажено $count пассажиров. Всего: $currentPassengers/$maxPassengers")
        } else {
            println("Не хватает мест! Максимум: $maxPassengers")
        }
    }

    override fun unloadPassengers() {
        println("Высажено $currentPassengers пассажиров.")
    }

    override fun loadCargo(weight: Double) {
        if (currentCargo + weight <= maxCargo) {
            currentCargo += weight
            println("Загружено $weight тонн. Всего: $currentCargo/$maxCargo т")
        } else {
            println("Перегруз! Максимум: $maxCargo т")
        }
    }

    override fun unloadCargo() {
        println("Выгружено $currentCargo тонн.")
    }

    override fun move() {
        println("Грузовик отправляется в путь с $currentPassengers пассажиром и $currentCargo т груза")
    }
}

class Car(
    val maxPassengers: Int = 3,
    var currentPassengers: Int = 0,
) : Movable, PassengerTransport {

    override fun loadPassengers(count: Int) {
        if (currentPassengers + count <= maxPassengers) {
            currentPassengers += count
            println("Посажено $count пассажиров. Всего: $currentPassengers/$maxPassengers")
        } else {
            println("Не хватает мест! Максимум: $maxPassengers")
        }
    }

    override fun unloadPassengers() {
        println("Высажено $currentPassengers пассажиров.")
    }

    override fun move() {
        println("Легковой автомобиль отправляется с $currentPassengers пассажирами")
    }
}

fun main() {
    // Создаем транспорт
    val truck1 = Truck()
    val truck2 = Truck()
    val car1 = Car()
    val car2 = Car()

    println("--- Загрузка ---")
    truck1.loadPassengers(1)
    truck1.loadCargo(1.5)
    truck2.loadPassengers(0)
    truck2.loadCargo(0.5)
    car1.loadPassengers(2)
    car2.loadPassengers(3)

    println("--- Перевозка ---")
    truck1.move()
    truck2.move()
    car1.move()
    car2.move()

    println("--- Разгрузка ---")
    truck1.unloadPassengers()
    truck1.unloadCargo()
    truck2.unloadPassengers()
    truck2.unloadCargo()
    car1.unloadPassengers()
    car2.unloadPassengers()
}