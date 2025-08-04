package org.example.lessson_12

class WeatherDataKelvin1(kelvinDay: Int, kelvinNight: Int) {
    val dayTemp = kelvinDay - KELVIN_TO_CELSIUS
    val nightTemp = kelvinNight - KELVIN_TO_CELSIUS
    val hasPrecipitation: Boolean = false

    init {
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
    val weatherDay1 = WeatherDataKelvin1(300, 290)
    val weatherDay2 = WeatherDataKelvin1(275, 260)

}