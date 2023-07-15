package quick_sort.kotlin

/** Задача. Написать рекурсивную функцию для
 * подсчета элементов в списке. */
fun main() = println(count(listOf(1, 4, 5, 28, 9)))

/**
 * Рекурсивная функция для подсчета элементов в списке
 */
private fun count(list: List<Any>): Int = when {
    list.isEmpty() -> 0
    else -> 1 + count(list.subList(1, list.size))
}