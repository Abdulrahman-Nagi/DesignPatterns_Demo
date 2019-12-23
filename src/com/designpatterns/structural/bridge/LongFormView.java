package com.designpatterns.structural.bridge;

import java.util.Hashtable;

public class LongFormView extends View {


  public   LongFormView(IResource resource) {
        super(resource);
    }

    @Override
   public String show() {

        System.out.println("Long Form Logic.......");

        String imageWithTitle = this.resource.image() + " " + this.resource.title();
        return imageWithTitle;
    }



}
