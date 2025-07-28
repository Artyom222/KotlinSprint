package org.example.lessson_12

class WeatherData {
    var dayTemp: String = "0"
    var nightTemp: String = "0"
    var hasPrecipitation: Boolean = false

    fun printWeather() {
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
    val weatherDay1 = WeatherData()
    val weatherDay2 = WeatherData()

    weatherDay1.dayTemp = "+22"
    weatherDay1.nightTemp = "+16"
    weatherDay1.hasPrecipitation = true
    weatherDay2.dayTemp = "+5"
    weatherDay2.nightTemp = "-2"
    weatherDay2.hasPrecipitation = false

    weatherDay1.printWeather()
    weatherDay2.printWeather()

}