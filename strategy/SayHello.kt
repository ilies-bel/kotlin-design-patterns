package strategy

class SayHelloKotlin(private val stringFormatterStrategy: (String) -> String) {
    fun print(string: String) {
        println(stringFormatterStrategy(string))
    }
}

val addMessage = { message: String -> "say $message 😎" }

val lowercase = fun(str: String) = str.lowercase()

val uppercase = { it: String -> it.uppercase() }

val reverse = String::reversed// fonctions anonymes

// Usage
fun main() {
    val addMessage = SayHelloKotlin(addMessage)
    val toLowerCase = SayHelloKotlin(lowercase)
    val toUpperCase = SayHelloKotlin(uppercase)
    val toReverse = SayHelloKotlin(reverse)

    addMessage.print("Hello World !")
    toLowerCase.print("Hello World !")
    toUpperCase.print("Hello World !")
    toReverse.print("Hello World !")
}