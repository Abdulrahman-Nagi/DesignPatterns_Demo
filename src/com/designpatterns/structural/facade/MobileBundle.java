package com.designpatterns.structural.facade;

public class MobileBundle implements Bundle {


    private Item item1;


    public void setItem1(Item item1) {
        this.item1 = item1;
    }

    public Item getItem1() {
        return item1;
    }


    @Override
    public String toString() {
        return "MobileBundle{" +
                "item1=" + item1 +
                '}';
    }
}
