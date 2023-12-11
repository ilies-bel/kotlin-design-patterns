package com.moon.services;

import com.moon.Article;
import com.moon.persistence.CartDao;

import java.util.List;

public enum CartService {
    INSTANCE;

    private final CartDao cartDao = CartDao.INSTANCE;
    public void addArticle(Article article) {
        cartDao.addArticle(article);
    }

    public void removeArticle(Article article) {
        cartDao.removeArticle(article);
    }

    public List<Article> getArticles(){
        return cartDao.getArticles();
    }

    public void clear() {
        cartDao.clear();
    }
}
