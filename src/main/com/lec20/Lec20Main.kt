package main.com.lec20

data class Person(
    val name: String,
    val age: Int,
    var hobby: String? = null
)

fun printPerson(person: Person?) {
    if (person != null) {
        println(person.name)
        println(person.age)
    }
}

fun printPerson2(person: Person?) {
    person?.let {
        println(it.name)
        println(it.age)
    }
}

fun main() {
    val person = Person("류욱상", 100)

    val value1 = person.let {
        it.age
    }

    val value2 = person.run {
        this.age
    }

    val value3 = person.also {
        it.age
    }

    val value4 = person.apply {
        this.age
    }

    with(person) {
        println(name)
        println(this.age)
    }

    val strings = listOf("APPLE", "CAR")
    strings.map { it.length }.filter { it > 3 }.let(::println)

    val str = "123"

    val legnth = str?.let {
        println(it.uppercase())
        it.length
    }

    val numbers = listOf("one", "tow", "three", "four")
    val modifiedFirstItem = numbers.first()
        .let { firstItem ->
            if (firstItem.length >= 5) firstItem else "!$firstItem!"
        }.uppercase()
    println(modifiedFirstItem)

    //val person = Person("류욱상", 100).run(personRepository::save)
    /*val person = Person("류욱상", 100).run {
        hobby = "독서"
        personRepository.save(this)
    }*/

    mutableListOf("one", "two", "three").
    also {
        println("four 추가 이전 지금 값: $it")
    }.add("four")

    val personDto = with(person) {
        PersonDto(
            name = this.name,
            age = this.age
        )
    }

    // 1번 코드
    if (person != null && person.isAdult) {
        view.showPerson(person)
    } else {
        view.showError()
    }

    //2번 코드
    person?.takeIf { it.isAdult }?.let(view::showPerson) ?: view.showError()
}

class PersonDto(
    val name: String,
    val age: Int
)

fun createPerson(
    name: String,
    age: Int,
    hobby: String
): Person {
    return Person(
        name = name,
        age = age
    ).apply {
        this.hobby = hobby
    }
}