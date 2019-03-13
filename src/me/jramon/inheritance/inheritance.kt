package me.jramon.inheritance

abstract class Animal(var name: String, var weight: Double) {
    override fun toString(): String {
        return "$name  $weight"
    }

    abstract fun run(): String
}

class Cat : Animal("Cat", 10.0) {

    override fun run(): String = "c_run"

}

fun main() {
    val animal = Cat()
    val result = animal.run()
    print(result)
}


