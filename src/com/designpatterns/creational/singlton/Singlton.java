package com.designpatterns.creational.singlton;



public class Singlton {


    private String name ;


    private static Singlton singlton;




    private Singlton() { }


    public static Singlton getInstance() {

        if(singlton==null) {

            singlton=new Singlton();
        }

        return singlton;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
