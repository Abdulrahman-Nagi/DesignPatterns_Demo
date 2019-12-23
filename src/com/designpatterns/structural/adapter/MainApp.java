package com.designpatterns.structural.adapter;

public class MainApp implements ITarget {


    @Override
    public void doAction() {

        System.out.println("Hello from Main Application");
    }
}
