package com.designpatterns.structural.composite;

import java.util.List;

public class Project implements TodoList {


   private String title;

   private List<TodoList> todos;


    public Project(String title, List<TodoList> todos) {
        this.title = title;
        this.todos = todos;
    }

    @Override
    public String getHTML() {

        String html="<h1>";

        html+=this.title;

        html+="</h1><ul>";


        for (TodoList todo : todos) {

            html+="<li>";

            html+=todo.getHTML();

            html+="</li>";

        }


        html+="</ul>";

        return html;
    }
}
