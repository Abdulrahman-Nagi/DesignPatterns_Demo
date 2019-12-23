package com.designpatterns.structural.facade;

public class Laptop implements Pormotion {

    private String laptopModel;


    @Override
    public Bundle getBundle() {

        Item item1 = new Item();
        item1.setItemCode(222);
        item1.setItemName("Laptop Case");

        Item item2 = new Item();
        item2.setItemCode(333);
        item2.setItemName("Mouse");

        LaptopBundle laptopBundle = new LaptopBundle();

        laptopBundle.setItem1(item1);
        laptopBundle.setItem2(item2);


        return laptopBundle;
    }

    public String getLaptopModel() {
        return laptopModel;
    }

    public void setLaptopModel(String laptopModel) {
        this.laptopModel = laptopModel;
    }
}
