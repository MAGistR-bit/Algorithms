package quick_sort.kotlin


fun main() = println(sum(arrayOf(2, 8, 2, 3)))

/**
 * Вычисляет сумму элементов массива
 */
private fun sum(arr: Array<Int>): Int {
    var total = 0
    for (x in arr) total += x
    return total
}