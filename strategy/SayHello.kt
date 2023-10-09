package strategy

class SayHello(private val stringFormatterStrategy: (String) -> String) {
    fun print(string: String) {
        println(stringFormatterStrategy(string))
    }
}

val addMessage  = { s: String -> "say $s 😎" }

val lowercase = fun(str : String) =  str.lowercase()

val uppercase = { it: String -> it.uppercase() }

val reverse = String::reversed// fonctions anonymes

// Usage
fun main() {
    val addMessagePrinter = SayHello(addMessage)
    val lowercasePrinter = SayHello(lowercase)
    val uppercasePrinter = SayHello(uppercase)
    val reversePrinter = SayHello(reverse)

    addMessagePrinter.print("Hello World !")
    lowercasePrinter.print("Hello World !")
    uppercasePrinter.print("Hello World !")
    reversePrinter.print("Hello World !")
}