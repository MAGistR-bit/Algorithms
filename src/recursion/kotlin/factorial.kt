package recursion.kotlin

fun main() = println(fact(5))

private fun fact(x: Int): Int = when (x) {
    1 -> 1
    else -> x * fact(x - 1)
}
