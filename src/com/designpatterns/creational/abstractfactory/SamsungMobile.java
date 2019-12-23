package com.designpatterns.creational.abstractfactory;

public class SamsungMobile implements MobileCategory{

    private int itemCode;

    private String itemName;


    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }



    @Override
    public int getItemCode() {
        return itemCode;
    }


    @Override
    public String getItemName() {
        return itemName;
    }
}
