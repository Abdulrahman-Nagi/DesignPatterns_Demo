package com.designpatterns.structural.bridge;

public class ShortFormView extends View {



  public   ShortFormView(IResource resource) {
        super(resource);
    }

    @Override
    public String show() {

        System.out.println("Short Form Logic .... ");

        String shortImageWithTitle = this.resource.image() + "Short image " + this.resource.title() + " Short Title";

        return shortImageWithTitle;
    }
}
