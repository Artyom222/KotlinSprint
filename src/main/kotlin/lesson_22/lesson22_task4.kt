package org.example.lesson_22

data class MainScreenState(
    val data: String? = null,
    val isLoading: Boolean = false
)

class MainScreenViewModel {
    val mainScreenState = MainScreenState()

    fun loadData() {
        var state = mainScreenState.copy()
        println("Состояние: $state")
        println("Отсутствие данных")
        println()

        Thread.sleep(1000)

        state = state.copy(isLoading = true)
        println("Состояние: $state")
        println("Загрузка данных")
        println()

        Thread.sleep(1000)

        state = state.copy(
            data = "Данные",
            isLoading = false
        )
        println("Состояние: $state")
        println("Данные загружены")
        println()
    }
}

fun main() {
    val viewModel = MainScreenViewModel()
    viewModel.loadData()
}