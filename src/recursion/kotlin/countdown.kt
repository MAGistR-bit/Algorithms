package recursion.kotlin

fun main() = countdown(5)

fun countdown(i: Int) {
    println(i)
    when {
        i <= 0 -> return            // <------ Базовый случай
        else -> countdown(i - 1) // <------- Рекурсивный случай
    }
}
