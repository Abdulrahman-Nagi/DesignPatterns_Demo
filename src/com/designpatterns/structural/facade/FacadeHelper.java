package com.designpatterns.structural.facade;




public class FacadeHelper {



    public Bundle getMobileBundle() {

        return new MobilePhone().getBundle();
    }



    public Bundle getLaptopBundle() {

      return   new Laptop().getBundle();
    }
}
