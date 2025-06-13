package org.example.lesson_2

fun main(){
    val grade = listOf(3, 4, 3, 5)
//    val numberOfStudent = grade.size.toFloat()
//    val arithmeticMean1 = grade.sum() / numberOfStudent
    val arithmeticMean2 = grade.average()
    println(arithmeticMean2)

}