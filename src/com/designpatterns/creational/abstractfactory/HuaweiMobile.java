package com.designpatterns.creational.abstractfactory;

public class HuaweiMobile implements MobileCategory {

    private int itemCode;

    private String itemName;




    public void setItemCode(int itemCode) {
        this.itemCode = itemCode;
    }

    @Override
    public int getItemCode() {
        return itemCode;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    @Override
    public String getItemName() {
        return itemName;
    }
}
