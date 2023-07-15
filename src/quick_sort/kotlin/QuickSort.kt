package quick_sort.kotlin

/**
 * Быстрая сортировка на Kotlin
 */
fun main() = println(quickSort(listOf(14, 8, 12, 1)))

fun quickSort(list: List<Int>): List<Int> {
    // Базовый случай (массивы с 0 или 1 элементом уже "отсортированы")
    if (list.size <= 1) return list

    // Рекурсивный случай
    val pivot = list[list.size / 2]
    val equal = list.filter { it == pivot }
    val less = list.filter { it < pivot }
    val greater = list.filter { it > pivot }
    return quickSort(less) + equal + quickSort(greater)
}
