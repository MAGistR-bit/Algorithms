package greedy_algorithms.kotlin

/**
 * Задача о покрытии множества.
 * Демонстрация работы жадного алгоритма.
 */

fun main() {
    // Список штатов
    val statesNeeded: MutableSet<String> = HashSet(listOf("mt", "wa", "or", "id",
            "nv", "ut", "ca", "az"))

    /* Список станций. Ключи - названия станций, а значения - сокращенные
    обозначения штатов, входящих в зону охвата */
    val stations: MutableMap<String, Set<String>> = LinkedHashMap()
    stations["kone"] = HashSet(listOf("id", "nv", "ut"))
    stations["ktwo"] = HashSet(listOf("wa", "id", "mt"))
    stations["kthree"] = HashSet(listOf("or", "nv", "ca"))
    stations["kfour"] = HashSet(listOf("nv", "ut"))
    stations["kfive"] = HashSet(listOf("ca", "az"))

    // Итоговый набор станций
    val finalStations: MutableSet<String> = HashSet()

    while (statesNeeded.isNotEmpty()) {
        var bestStation: String? = null
        var statesCovered: Set<String?> = HashSet()
        for ((key, value) in stations) {
            val covered: MutableSet<String?> = HashSet(statesNeeded)
            covered.retainAll(value)
            if (covered.size > statesCovered.size) {
                bestStation = key
                statesCovered = covered
            }
            statesNeeded.removeIf { o: String? ->
                statesCovered.contains(o)
            }
            if (bestStation != null) {
                finalStations.add(bestStation)
            }
        }
    }

    println(finalStations) // [ktwo, kone, kthree, kfive]
}