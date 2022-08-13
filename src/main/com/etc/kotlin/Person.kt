package main.com.etc.kotlin

class Person(name: String, var age: Int) {

    /*val name: String = name
        get() = field.uppercase()*/

    var name = name
        set(value) {
            field = value.uppercase()
        }


    init {
        if (age <= 0) {
            throw IllegalArgumentException("나이는 ${age}일 수 없습니다.")
        }
    }

    constructor(name: String): this(name, 1) {
        println("첫번재 부생성자")
    }

    val isAdult: Boolean
        get() = this.age >= 20
}