package main.com.lec12

fun main() {

}

class Person private constructor(
    val name: String,
    var age: Int,
) {
    companion object Factory : Log {
        private const val MIN_AGE = 1

        @JvmStatic
        fun newBaby(name: String): Person {
            return Person(name, MIN_AGE)
        }

        override fun log() {
            println("나는 Person 객체의 동행 객체입니당.")
        }
    }
}

object Singleton

