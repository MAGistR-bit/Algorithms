package quick_sort.kotlin

/** Задача.
 * Имеется массив чисел. Нужно просуммировать все числа и
 * вернуть сумму. Решить задачу, используя рекурсию.
 */
fun main() = println(sum(intArrayOf(6, 4, 9, 1)))

/**
 * Вычисляет сумму элементов массива,
 * используя рекурсивный подход
 */
private fun sum(arr: IntArray): Int = when {
    arr.isEmpty() -> 0
    else -> arr[0] + sum(arr.copyOfRange(1, arr.size))
}