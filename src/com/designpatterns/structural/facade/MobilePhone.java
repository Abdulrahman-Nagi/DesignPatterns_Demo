package com.designpatterns.structural.facade;

public class MobilePhone implements Pormotion {

    private String mobileModel;



    @Override
    public Bundle getBundle() {

        Item item1= new Item();
        item1.setItemCode(555);
        item1.setItemName("Screen Protector");

        MobileBundle mobileBundle = new MobileBundle();

        mobileBundle.setItem1(item1);


        return mobileBundle;
    }

    public String getMobileModel() {
        return mobileModel;
    }

    public void setMobileModel(String mobileModel) {
        this.mobileModel = mobileModel;
    }
}
