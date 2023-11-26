package kotlin.address

data class Address(
    val street: String? = null,
    val city: String? = null,
    val zipCode: String? = null,
    val country: String? = null,
    val supplement: String? = null
)

fun main() {
    val address = Address(
        street = "Rue de la Paix",
        city = "Paris",
        zipCode = "75000",
        country = "France",
        supplement = "Appartement 123"
    )

    val javaAddress  = AddressJ.Builder()
        .street("Rue de la Paix")
        .city("Paris")
        .zipCode("75000")
        .country("France")
        .supplement("Appartement 123")
        .build()

}