package org.example.lesson_17

class File(
    val name: String,
    val type: String,
    val content: String,
)

class Folder(
    val folderName: String,
    val isSecret: Boolean,
) {
    val files: MutableList<File> = mutableListOf<File>(
        File("001", "doc", ""),
        File("002", "doc", ""),
        File("003", "doc", "")
    )
    val countFiles: Int = files.size
    val name
        get() = if (isSecret) {
            "Скрытая папка. Количество файлов: 0"
        } else {
            "$folderName. Количество файлов: $countFiles"
        }
}

fun main() {
    val folder1 = Folder("Обычная папка", false)
    val folder2 = Folder("Папка с секретом", true)

    println(folder1.name)
    println(folder2.name)
}