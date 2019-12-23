package com.designpatterns.structural.adapter;

public class PluginTwo implements Adaptee {


    @Override
    public void doSpecificAction() {
        System.out.println("Hello from Plugin two");
    }
}
