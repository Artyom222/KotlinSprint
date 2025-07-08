package org.example.lesson_8

fun main() {
    val viewedAds = IntArray(7) {(1..20).random()}
    var sum = 0

    print("Кол-во просмотров за каждый день: ")
    for (i in viewedAds.indices) {
        sum = sum + viewedAds[i]
        print("${viewedAds[i]} ")
    }
    println("\nПросмотров за неделю: $sum")
}