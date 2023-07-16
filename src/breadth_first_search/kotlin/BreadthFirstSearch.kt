package breadth_first_search.kotlin

import java.util.*

val graph = hashMapOf(
        "You" to listOf("Danila", "Aleksandr"),
        "Aleksandr" to listOf("Danila", "Vladimir"),
        "Vladimir" to listOf("Danila", "Mikhail", "Dmitriy", "Boris")
)

fun main() = println(breadthFirstSearch("You"))

private fun breadthFirstSearch(name: String) {
    val queue = ArrayDeque(graph[name])
    val searched = arrayListOf<String>()
    while (queue.isNotEmpty()) {
        val person = queue.poll()
        if (!searched.contains(person)) {
            if (personIsSeller(person)) {
                println("$person is a mango seller!")
                return
            } else {
                graph[person]?.let { queue.addAll(it) }
                searched.add(person)
            }
        }
    }
    println("No mango sellers found!")
}

private fun personIsSeller(name: String): Boolean = name.endsWith("l")