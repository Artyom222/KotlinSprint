package org.example.lessson_12

const val KELVIN_TO_CELSIUS = 273

class WeatherDataKelvin(kelvinDay: Int, kelvinNight: Int) {
    val dayTemp = kelvinDay - KELVIN_TO_CELSIUS
    val nightTemp = kelvinNight - KELVIN_TO_CELSIUS
    val hasPrecipitation: Boolean = false

    fun printWeatherCelsius() {
        println(
            """
            Погода сегодня:
            Дневная температура: $dayTemp°C
            Ночная температура: $nightTemp°C
            Осадки: ${if (hasPrecipitation) "да" else "нет"}
        """.trimIndent()
        )
    }
}

fun main() {
    val weatherDay1 = WeatherDataKelvin(300, 290)
    val weatherDay2 = WeatherDataKelvin(275, 260)

    weatherDay1.printWeatherCelsius()
    weatherDay2.printWeatherCelsius()

}