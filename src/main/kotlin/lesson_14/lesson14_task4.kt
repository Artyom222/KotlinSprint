package org.example.lesson_14

open class CelestialBody(
    val name: String,
    val hasAtmosphere: Boolean,
    val isLandable: Boolean,
)

class Planet(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
    val satellites: List<Satellite>,
) : CelestialBody(name, hasAtmosphere, isLandable)

class Satellite(
    name: String,
    hasAtmosphere: Boolean,
    isLandable: Boolean,
) : CelestialBody(name, hasAtmosphere, isLandable)

fun main() {
    val mars = Planet(
        "Марс", false, true, listOf(
            Satellite("Фобос", false, false),
            Satellite("Деймос", false, false)
        )
    )

    println(
        """
        Название планеты: ${mars.name}
        Спутники: ${mars.satellites.joinToString { it.name }}
    """.trimIndent()
    )
}
