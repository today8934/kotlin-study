package main.com.lec04

import main.com.etc.java.JavaMoney
import main.com.etc.kotlin.Money

fun main() {
    val javaMoney = JavaMoney(2000L)
    val javaMoney1 = JavaMoney(1000L)

    if (javaMoney > javaMoney1) {
        println("Money가 Money1보다 큽니다.")
    }

    val javaMoney2 = JavaMoney(1000L)
    val javaMoney3 = javaMoney2
    val javaMoney4 = JavaMoney(1000L)

    println(javaMoney2 === javaMoney3)
    println(javaMoney2 === javaMoney4)
    println(javaMoney2 == javaMoney4)

    if (fun1() || fun2()) {
        println("본문실행")
    }

    val numbers = listOf(1, 2, 3)
    println(1 in numbers)

    val money1 = Money(1000L)
    val money2 = Money(2000L)
    println(money1 + money2)
}

fun fun1(): Boolean {
    println("fun1")
    return true
}

fun fun2(): Boolean {
    println("fun2")
    return false
}