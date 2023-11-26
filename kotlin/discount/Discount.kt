package kotlin.discount

/*
fun interface DiscountStrategy {
     fun  compute(product: Product) : Double
} // TODO Transcrire en java
*/


fun interface DiscountStrategy : (Product) -> Double

val fixedRateStrategy = strategyFactory("fixed")

val discountStrategy = strategyFactory("percentage", 0.9)


fun  strategyFactory(type : String, rate : Double?) : DiscountStrategy {
   return when(type) {
        "fixed" -> DiscountStrategy {
            it.price - 10
        }
        "percentage" -> DiscountStrategy {
            it.price * rate
        }
        else -> error("TODO")
    }
}

class DiscountCalculator(private val discountStrategy : DiscountStrategy) {

    fun getDiscountedPrice(product: Product) = discountStrategy(product)

}


class DiscountService(private val discountStrategy : DiscountStrategy) {


    fun discountedPrice(product: Product): Double {
        val test = DiscountCalculator(discountStrategy)

        return when(product) {
            is Phone -> {
                test.getDiscountedPrice(product)
            }
            is VideoGame -> {
                discountStrategy
            }
            is Book -> {
                fixedRateStrateg
            }

            else -> error("TODO")
        }
    }


    fun totalCartPrice(): Double{
        val book = Book(1, "ref", "name", 10.0, "model")
        val book2 = Book(1, "ref", "name", 10.0, "model")
        val phone = Phone(1, "ref", "name", 10.0, "model")
        val procts = listOf(book, book2, phone)

        return procts.sumOf { discountedPrice(it).compute(it) }


    }
}


