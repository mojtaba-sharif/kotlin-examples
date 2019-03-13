package me.jramon.classes


//class
class Order(val item: String, var quantity: Int, var price: Double) {
}

//data class
data class Person(var firstName: String, var lastName: String, var age: Int)

//enum
enum class Day {
    MON, TUE, WED, THUR, FRI, SAT, SUN
}

//object
object Singleton {
    val msg = "Hello World! :)"
}

class Companion {
    companion object {
        val meta = "Static property"

        fun info() = "Example class with a static function and property"
    }
}

fun printObject() {
    println("Singleton: ${Singleton.msg}")
    println("Companion Object: meta - ${Companion.meta}, info - ${Companion.info()}")
}