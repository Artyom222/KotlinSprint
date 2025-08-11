package org.example.lesson_15

interface Searchable {
    fun search()
}

abstract class MusicStoreProduct(
    val name: String,
    val stockQuantity: Int,
) {
    fun displayInfo() {
        println("Товар: $name (в наличии: $stockQuantity шт.)")
    }
}

class Instrument(
    name: String,
    stockQuantity: Int,
) : MusicStoreProduct(name, stockQuantity), Searchable {

    fun searchAccessories() {
        println("Выполняется поиск комплектующих для инструмента $name")
    }

    override fun search() {
        println("Выполняется поиск")
    }
}

class Accessory(
    name: String,
    stockQuantity: Int,
) : MusicStoreProduct(name, stockQuantity), Searchable {
    override fun search() {
        println("Выполняется поиск")
    }
}

fun main() {
    val guitar = Instrument("Гитара Yamaha", 3)
    val drums = Instrument("Барабаны", 2)
    val strings = Accessory("Струны", 20)

    guitar.displayInfo()
    drums.displayInfo()
    strings.displayInfo()
    guitar.search()
    guitar.searchAccessories()

}
