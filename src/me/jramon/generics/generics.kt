package me.jramon.generics

fun main() {
    val nums = arrayOf<Number>(7, 42.7)

    println("Combined Numbers: ${combineToString(nums[0], nums[1])}")
}

fun <T : Number> combineToString(num1: T, num2: T) = "$num1$num2"

class Box<T>(val item: T)