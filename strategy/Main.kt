class Printer(private val stringFormatterStrategy: (String) -> String) {
    fun print(string: String) {
        println(stringFormatterStrategy(string))
    }
}

val reverse  = { s: String -> s.reversed() }

val lowercase : (String) -> String  = String::lowercase

val uppercase = { it: String -> it.uppercase() }

val test = fun(s: String) = s.reversed()

// Usage


fun main() {
    val printer = Printer(uppercase)
    printer.print("Hello Takima !")
}