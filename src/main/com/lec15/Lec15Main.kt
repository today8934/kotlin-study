package main.com.lec15

fun main() {
    val array = arrayOf(100, 200)

    for (i in array.indices) {
        println("$i ${array[i]}")
    }

    for ((idx, value) in array.withIndex()) {
        println("$idx $value")
    }

    array.plus(300)

    val numbers = listOf(100, 200)
    val emptyList = emptyList<Int>()

    for (number in numbers) {
        println(number)
    }

    for ((idx, value) in numbers.withIndex()) {
        println("$idx $value")
    }

    val numbers2 = mutableListOf(100, 200)
    numbers2.add(300)

    val numbers3 = setOf(100, 200)
    val numbers4 = mutableSetOf(100, 200)

    for (number in numbers3) {
        println(number)
    }

    for ((idx, value) in numbers3.withIndex()) {
        println("$idx $value")
    }

    val oldMap = mutableMapOf<Int, String>()
    oldMap.put(1, "Monday")
    oldMap[2] = "Tuesday"

    val map = mapOf(1 to "Monday", 2 to "Tuesday")

    for (key in oldMap.keys) {
        println(key)
        println(oldMap.get(key))
        println(oldMap[key])
    }

    for ((key, value) in oldMap) {
        println(key)
        println("$key $value")
    }
}