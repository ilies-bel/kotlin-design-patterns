package com.sun.services

import com.sun.models.Article
import com.sun.persistence.CartDao

object CartService {

    fun addArticle(article: Article) {
        CartDao.addArticle(article)
    }

    fun removeArticle(article: Article) {
        CartDao.removeArticle(article)
    }

    fun getArticles(): List<Article> {
        return CartDao.getArticles()
    }

    fun clear() {
        CartDao.clear()
    }
}