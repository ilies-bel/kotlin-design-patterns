package com.sun.persistence

import com.sun.models.Article

object CartDao {
    private val cart: MutableMap<Article, Int> = mutableMapOf()

    fun addArticle(article: Article) {
        println("add article")
        cart[article] = 1
    }

    fun removeArticle(article: Article) {
        println("remove article")
        cart.remove(article)
    }

    fun getArticles(): List<Article> {
        println("get articles")
        return cart.keys.toList()
    }

    fun clear() {
        println("clear")
        cart.clear()
    }
}