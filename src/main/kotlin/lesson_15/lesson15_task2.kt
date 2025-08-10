package org.example.lesson_15

abstract class WeatherStationStats(
    val stationName: String,
) {
    abstract fun getValue(): String
}

class Temperature(
    stationName: String,
    val value: Double,
) : WeatherStationStats(stationName) {
    override fun getValue(): String = "Температура $value°C"
}

class PrecipitationAmount(
    stationName: String,
    val value: Double,
) : WeatherStationStats(stationName) {
    override fun getValue(): String = "Количство осадков $value мм"
}

class WeatherServer {
    fun sendData(data: WeatherStationStats) {
        println("Отправляем на сервер данные: \n${data.getValue()}")
    }
}

fun main() {
    val server = WeatherServer()
    val tempData = Temperature("St1", 12.5)
    val precipData = PrecipitationAmount("St1", 3.0)

    server.sendData(tempData)
    server.sendData(precipData)


}