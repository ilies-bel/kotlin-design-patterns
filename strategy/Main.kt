class SayHello(private val stringFormatterStrategy: (String) -> String) {
    fun print(string: String) {
        println("Hello " + stringFormatterStrategy(string))
    }
}

val addMessage  = { s: String -> "message: $s" }

val lowercase = fun(str : String) =  str.lowercase()

val uppercase = { it: String -> it.uppercase() }

val reverse = String::reversed// fonctions anonymes

// Usage

fun main() {
    val printer = Printer(uppercase)
    printer.print("Hello Takima !")
}