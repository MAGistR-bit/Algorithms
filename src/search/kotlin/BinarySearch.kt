package search.kotlin

/**
 * Бинарный поиск на Kotlin
 */
val sortedArray = (0..100 step 3).toList()

fun main() {
    print(sortedArray.binarySearch(6))
}

fun List<Int>.binarySearch(item: Int): Int? {
    var min = 0
    var max = lastIndex
    while (min <= max) {
        val mid = (min + max) / 2
        val guess = this[mid]
        if (guess == item) return mid
        if (guess > item) max = mid - 1
        else min = mid + 1
    }
    return null
}