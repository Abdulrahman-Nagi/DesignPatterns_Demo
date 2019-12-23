package com.designpatterns.structural.adapter;

public class Plugin implements Adaptee {



    @Override
    public void doSpecificAction() {

        System.out.println("Hello from Plugin one");

    }
}
