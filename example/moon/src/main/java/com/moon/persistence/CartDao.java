package com.moon.persistence;

import com.moon.Article;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public enum CartDao {
    INSTANCE;

    private final Map<Article, Integer> cart = new HashMap<>();


    public void addArticle(Article article) {
        System.out.println("add article");
        cart.put(article, 1);
    }

    public void removeArticle(Article article) {
        System.out.println("remove article");
        cart.remove(article);
    }

    public List<Article> getArticles(){
        System.out.println("get articles");
        return new ArrayList<>(cart.keySet());
    }

    public void clear() {
        System.out.println("clear");
        cart.clear();
    }

}
