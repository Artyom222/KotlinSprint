package org.example.lessson_12

class DayWeatherData(
    var dayTemp: Int,
    var nightTemp: Int,
    var hasPrecipitation: Boolean,
) {}

fun main() {
    val daysCount = 30
    val weatherDays = mutableListOf<DayWeatherData>()

    repeat(daysCount) {
        val dayTemp = (15..30).random()
        val nightTemp = (5..20).random()
        val hasPrecipitation = listOf(true, false).random()
        val weather = DayWeatherData(dayTemp, nightTemp, hasPrecipitation)
        weatherDays.add(weather)
    }

    val dayTempData = weatherDays.map { it.dayTemp }
    val nightTempData = weatherDays.map { it.nightTemp }
    val rainyDaysCount = weatherDays.count { it.hasPrecipitation }

    val avgDayTemp = dayTempData.average()
    val avgNightTemp = nightTempData.average()

    println(
        """
        Средняя дневная температура в этом месяце: ${"%.1f°C".format(avgDayTemp)}
        Средняя ночная температура в этом месяце: ${"%.1f°C".format(avgNightTemp)}
        Дней с осадками: $rainyDaysCount
    """.trimIndent()
    )
}