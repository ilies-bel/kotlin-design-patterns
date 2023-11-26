package kotlin

open class Product(
    val id: Long,
    val ref: String,
    val name: String,
    val price: Double,
) {
    companion object {
        fun of(type: String, product: Product): Product {
            when (type) {
                "phone" -> return Phone()
            }
        }
    }
}

class Phone(id: Long, ref: String, name: String, price: Double, model: String) :
    Product(id, ref, name, price) {

    companion object {
        fun of(product: Product): Phone {
            return Phone(id = product.id, ref = product.ref, name = product.name, price = product.price, model = "ddd")
        }
    }
}

class VideoGame(id: Long, ref: String, name: String, pegi: Int,  description: String, brand: String, price: Double) :
    Product(id = id, ref = ref, name = name, price = price)

class Book(id: Long, ref: String, name: String, price: Double, model: String) : Product(
    id = id,
    ref = ref,
    name = name,
    price = price
)