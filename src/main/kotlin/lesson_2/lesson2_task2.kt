package lesson_2

fun main(){
    val salariesOfRegularEmployees = 30_000
    val salariesOfInterns = 20_000
    val numberOfRegularEmployees = 50
    val numberOfInterns = 30

    val sumOfsalariesRegularEmployees = salariesOfRegularEmployees * numberOfRegularEmployees
    val sumOfsalariesInterns = salariesOfInterns * numberOfInterns
    val salaryFund = sumOfsalariesRegularEmployees + sumOfsalariesInterns
    val averageSalary = salaryFund / (numberOfInterns + numberOfRegularEmployees)

    println("Выплаты постоянным сотрудникам: $sumOfsalariesRegularEmployees")
    println("Весь зарплатный фонд: $salaryFund")
    println("Средняя зарплата: $averageSalary")

}