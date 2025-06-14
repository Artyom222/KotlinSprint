package lesson_2

fun main() {
    val salariesOfRegularEmployees = 30_000
    val salariesOfInterns = 20_000
    val numberOfRegularEmployees = 50
    val numberOfInterns = 30

    val sumOfSalariesRegularEmployees = salariesOfRegularEmployees * numberOfRegularEmployees
    val sumOfSalariesInterns = salariesOfInterns * numberOfInterns
    val salaryFund = sumOfSalariesRegularEmployees + sumOfSalariesInterns
    val averageSalary = salaryFund / (numberOfInterns + numberOfRegularEmployees)

    println("Выплаты постоянным сотрудникам: $sumOfSalariesRegularEmployees")
    println("Весь зарплатный фонд: $salaryFund")
    println("Средняя зарплата: $averageSalary")

}