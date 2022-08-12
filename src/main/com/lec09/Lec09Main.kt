package main.com.lec09

import main.com.etc.JavaPerson
import main.com.etc.Person

fun main() {
    val person = Person("류욱상", 100)
    person.age = 10
    println(person.age)
    println(person.name)

    val javaPerson = JavaPerson("류욱상", 100)

    javaPerson.age = 10
    println(javaPerson.age)
    println(javaPerson.name)
}