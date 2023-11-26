package kotlin

import kotlin.address.Address


data class Cart(val articles: List<Article>) {

    val totalPrice: Double
        get() = articles.sumOf(Article::price)
}

data class Article(
    val name: String,
    val price: Double,
    val description: String,
    val seller: Seller,
)

data class Seller(
    val name: String,
    val address: Address
)