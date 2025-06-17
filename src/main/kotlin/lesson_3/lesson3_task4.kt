package lesson_3

fun main() {
    var fromWhere = "E2"
    var toWhere = "E4"
    var moveNumber = "1"
    var moveString = "$fromWhere - $toWhere; $moveNumber"
    println("[$moveString]")
    fromWhere = "D2"
    toWhere = "D3"
    moveNumber = "2"
    moveString = "$fromWhere - $toWhere; $moveNumber"
    println("[$moveString]")

}