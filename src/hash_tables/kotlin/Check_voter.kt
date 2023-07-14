package hash_tables.kotlin

/**
 * Пример на Kotlin
 */
private val voted:HashMap<String,Boolean> = HashMap()

fun main() {
    checkVoter("tom")   // let them vote!
    checkVoter("mike")  // let them vote!
    checkVoter("ivan")  // let them vote!
    checkVoter("ivan")  // kick them out!

}

private fun checkVoter(name: String) {
    if(!voted.containsKey(name)){
        voted[name] = true
        println("let them vote!")
    } else {
        println("kick them out!")
    }
}