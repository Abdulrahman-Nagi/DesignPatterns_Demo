package com.designpatterns.structural.bridge;

public class ArticleResource implements IResource {

        private   Article article;


    public ArticleResource(Article article) {
        this.article = article;
    }

    @Override
    public String title() {
        return article.getTitle();
    }

    @Override
    public String image() {
        return article.getImage();
    }
}
