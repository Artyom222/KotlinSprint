package lesson_3

fun main() {
    val moveString = "D2-D4;0"
    val parts = moveString.split("-", ";")
    val fromWhere = parts[0]
    val toWhere = parts[1]
    val moveNumber = parts[2]
    println("откуда: $fromWhere \nкуда: $toWhere \nномер хода: $moveNumber")
}