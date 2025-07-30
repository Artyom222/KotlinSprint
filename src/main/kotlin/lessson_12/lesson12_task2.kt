package org.example.lessson_12

class TheWeatherData(
    var dayTemp: String,
    var nightTemp: String,
    var hasPrecipitation: Boolean,
) {

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
    val weatherDay1 = TheWeatherData("+22", "+16",true)
    val weatherDay2 = TheWeatherData("+5","-2",false)

    weatherDay1.printWeather()
    weatherDay2.printWeather()

}