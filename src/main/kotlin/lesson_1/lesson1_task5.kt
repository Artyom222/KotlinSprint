package org.example.lesson_1

const val SECOND_IN_MINUTE = 60
const val MINUTE_IN_HOUR = 60

fun main(){
    var second = 6480
    var minute = second / SECOND_IN_MINUTE
    second = second % SECOND_IN_MINUTE
    val hour = minute / MINUTE_IN_HOUR
    minute = minute % MINUTE_IN_HOUR

    println("%02d:%02d:%02d".format(hour, minute, second))

}