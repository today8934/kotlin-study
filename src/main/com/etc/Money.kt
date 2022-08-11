package main.com.etc

class Money(private val amount: Long) {

    operator fun plus(other: Money): Money {
        return Money(this.amount + other.amount)
    }

    override fun toString(): String {
        return "Money(amount=$amount)"
    }
}