package com.designpatterns.structural.bridge;

public class BookResource implements IResource {

   private Book book;

    public BookResource(Book book) {
        this.book = book;
    }

    @Override
    public String title() {
        return book.getTitle();
    }

    @Override
    public String image() {
        return book.getImage();
    }
}
