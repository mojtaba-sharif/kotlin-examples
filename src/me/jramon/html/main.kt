package me.jramon.html



fun main(args: Array<String>) {
    val result = result()
    print(result)
}
fun result() =
    html {
        head {
            title { +"XML encoding with Kotlin" }
        }
        body {
            h1 { +"XML encoding with Kotlin" }
            p { +"this format can be used as an alternative markup to XML" }

            // an element with attributes and text content
            a(href = "http://kotlinlang.org") { +"Kotlin" }

            // mixed content
            p {
                +"This is some"
                b { +"mixed" }
                +"text. For more see the"
                a(href = "http://kotlinlang.org") { +"Kotlin" }
                +"project"
            }
            p { +"some text" }
        }
    }