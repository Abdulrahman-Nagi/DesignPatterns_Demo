package com.designpatterns.behavioral.template;

import java.util.Collection;
import java.util.List;

public class Post extends SavingRecord {


    private String title;

    private List<String> comments;





    @Override
    boolean validate() {

        if(!title.equals(null)&&comments!=null) {

            return true;
        }
        else {
            return false;
        }
    }



    @Override
    void beforeSave() {

        System.out.println("Before saving Post with Title "+title + " and Comments --> " );
        for (int i = 0; i <comments.size() ; i++) {

            System.out.println(comments.get(i));
        }

    }

    @Override
    void afterSave() {

        System.out.println("Post " + title + " Saved successfully");

    }

    @Override
    void error() {

        System.out.println("Post missing important Data !");

    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<String> getComments() {
        return comments;
    }

    public void setComments(List<String> comments) {
        this.comments = comments;
    }
}
