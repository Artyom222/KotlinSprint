package org.example.lesson_1
var second = 6480

fun main(){
    var minute = second / 60 //делим нацело
    second = (second - minute * 60) //из первонаяального количества секунд отнимаем количество минут = остаток
    val hour = minute / 60
    minute = minute - hour * 60
//Переводим числа в строковый тип и добавляем 0, пока длина строки не станет 2
    println("${hour.toString().padStart(2, '0')}:${minute.toString().padStart(2, '0')}:${second.toString().padStart(2, '0')}")

}