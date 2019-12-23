package com.designpatterns.structural.proxy;

public class ProxyStringParser implements IStringParser {

    private StringParser stringParser=null;

    private String s=null;

    public ProxyStringParser(String string) {

        this.s=string;

    }

    @Override
    public int getNumChars() {

        if(this.stringParser==null) {

            this.stringParser=new StringParser(this.s);
        }

        return this.stringParser.getNumChars();
    }
}
