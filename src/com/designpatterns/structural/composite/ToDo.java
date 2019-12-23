package com.designpatterns.structural.composite;

public class ToDo implements TodoList {


    private String text;

    public ToDo(String text) {

        this.text=text;
    }

    @Override
    public String getHTML() {
        return text;
    }
}
