package lesson_2
const val MINUTE_IN_HOUR = 60

fun main() {
    val departureHour = 9
    val departureMinute = 39
    val travelTimeMinute = 457

    val totalDepartureMinute = departureHour * MINUTE_IN_HOUR + departureMinute
    val totalArrivalMinute = totalDepartureMinute + travelTimeMinute

    val arrivalHour = totalArrivalMinute / MINUTE_IN_HOUR
    val arrivalMinute = totalArrivalMinute % MINUTE_IN_HOUR

    println("Время отправления поезда:%02d:%02d".format(departureHour,departureMinute))
    println("Время прибытия поезда:%02d:%02d".format(arrivalHour,arrivalMinute))

}