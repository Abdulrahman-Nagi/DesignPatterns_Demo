package com.designpatterns.creational.abstractfactory;

public class HuaweiCharger implements ChargerCategory {

    private int chargerCode;

    private  String chargerName;


    @Override
    public int getChargerCode() {
        return chargerCode;
    }

    public void setChargerCode(int chargerCode) {
        this.chargerCode = chargerCode;
    }


    @Override
    public String getChargerName() {
        return chargerName;
    }

    public void setChargerName(String chargerName) {
        this.chargerName = chargerName;
    }
}
