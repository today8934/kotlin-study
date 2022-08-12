package main.com.lec03

import main.com.etc.JavaPerson

fun main() {
    val number1 = 3
    val number2: Long = number1.toLong()

    val number3: Int? = 3
    val number4: Long = number3?.toLong() ?: 0

    printAgeIfPerson2(JavaPerson("류욱상"))
    printAgeIfPerson2(JavaPerson("류욱상", 100))

    val javaPerson = JavaPerson("류욱상", 100)
    val log = "사람의 이름은 ${javaPerson.name}이고 나이는 ${javaPerson.age}세 입니다"

    val name = javaPerson.name
    val age = javaPerson.age
    val log2 = "사람의 이름은 $name 이고 나이는 $age 입니다."

    println(log)
    println(log2)

    val str = """
        ABC
        DEF
        ${name}
    """.trimIndent()
    println(str)

    val str2 = "ABCDE"
    val ch = str2[1]
    println(ch)
}

fun printAgeIfPerson(obj: Any) {
    if (obj is JavaPerson) {
        val javaPerson = obj as JavaPerson
        println(javaPerson.age)
    }
}

fun printAgeIfPerson2(obj: Any?) {
    val javaPerson = obj as? JavaPerson
    println(javaPerson?.age)
}

fun fail(message: String): Nothing {
    throw IllegalArgumentException(message)
}