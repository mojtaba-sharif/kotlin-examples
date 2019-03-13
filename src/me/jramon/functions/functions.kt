package me.jramon.functions


val name = "JRamon"


fun printGreeting(name: String) {
    println("Hello $name!")
}

//lambda
fun greeter(msg: () -> String) {
    println("Hello $msg")
}


//extension function
fun String.isNumber(): Boolean {
    var valid = true
    try {
        Integer.valueOf(this)
    } catch (ex: NumberFormatException) {
        valid = false
    }
    return valid
}