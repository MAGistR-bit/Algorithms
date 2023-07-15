package selection_sort.kotlin

/**
 * Сортировка выбором на Kotlin
 */
fun main() {
    val array = arrayListOf(0, 2, 5, 1, 8, 23, 6, 21, 18, 213, 31, 9, 151)
    print("sort: ${array.selectionSort()}")
}

fun ArrayList<Int>.selectionSort(): ArrayList<Int> {
    val sortedArray = arrayListOf<Int>()
    for (i in 0 until size) {
        val smallest = getSmallest()
        sortedArray += this[smallest]
        removeAt(smallest)
    }
    return sortedArray
}

fun ArrayList<Int>.getSmallest(): Int {
    var smallest = this[0]
    var index = 0
    for (i in 1 until size) if (this[i] < smallest) {
        smallest = this[i]
        index = i
    }
    return index
}
