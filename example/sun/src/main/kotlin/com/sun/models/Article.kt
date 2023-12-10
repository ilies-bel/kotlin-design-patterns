package com.sun.models


data class Cart(val articles: List<Article>) {

    val totalPrice: Double
        get() = articles.sumOf(Article::price)
}

data class Article(
    val name: String,
    val price: Double,
)

data class Seller(
    val name: String,
    val address: Address
)