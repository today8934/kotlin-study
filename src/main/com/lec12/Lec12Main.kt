package main.com.lec12

fun main() {
    moveSomeThing(object: Moveable {
        override fun move() {
            println("움직인다아앙")
        }

        override fun fly() {
            println("난다아앙")
        }
    })
}

private fun moveSomeThing(moveable: Moveable) {
    moveable.move()
    moveable.fly()
}