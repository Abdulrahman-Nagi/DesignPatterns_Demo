package com.designpatterns.structural.proxy;

public class StringParser implements IStringParser {

    private int pageNumbers=0;

    public StringParser(String s) {

        System.out.println("Doing Heavy Operations");

        this.pageNumbers=s.length();


    }

    @Override
    public int getNumChars() {
        return this.pageNumbers;
    }
}
