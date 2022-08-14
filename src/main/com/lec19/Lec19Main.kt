package main.com.lec19

import main.com.lec18.Fruit
import main.com.lec19.a.printHelloWorld as printHelloWorldA
import main.com.lec19.b.printHelloWorld as printHelloWorldB

data class Person(
    val name: String,
    val age: Int
)

val number = 0

fun main() {
    printHelloWorldA()
    printHelloWorldB()

    val person = Person("류욱상", 100)
    val (name, age) = person

    val name2 = person.component1()
    val age2 = person.component2()

    loop@ for (i in 1..100) {
        for (j in 1..100) {
            if (j == 2) {
                break@loop
            }
            print("$i $j")
        }
    }
}

typealias FruitFilter = (Fruit) -> Boolean

fun filterFruits(fruits: List<Fruit>, filter: FruitFilter) {

}

data class UltraSuperGuardianTribe(
    val name: String
)

typealias USGTMap = Map<String, UltraSuperGuardianTribe>

fun getNumberOrNull(): Int? {
    return if (number <= 0) {
        null
    } else {
        number
    }
}

fun getNumberOrNullV2(): Int? {
    return number.takeIf { it > 0 }
}

fun getNumberOrNullV3(): Int? {
    return number.takeUnless { it <= 0 }
}