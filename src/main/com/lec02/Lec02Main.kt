package main.com.lec02

import main.com.etc.Person
import java.lang.IllegalArgumentException

fun main() {
    val str: String? = "ABC"
    //str.length //불가능
    str?.length // 가능

    val str2: String? = "ABC"
    str?.length ?: 0

    val person = Person("류욱상")
    startsWithA5(person.name)
}

fun startsWithA(str: String): Boolean {
    return str.startsWith("A")
}

fun startsWithA1(str: String?): Boolean {
    return str?.startsWith("A") ?: throw IllegalArgumentException("Null이 들어왔습니다.")
}

fun startsWithA2(str: String?): Boolean? {
    return str?.startsWith("A")
}

fun startsWithA3(str: String?): Boolean {
    return str?.startsWith("A") ?: false
}

fun startsWithA4(str: String?): Boolean {
    return str!!.startsWith("A")
}

fun startsWithA5(str: String): Boolean {
    return str.startsWith("A")
}