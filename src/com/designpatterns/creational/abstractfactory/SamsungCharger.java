package com.designpatterns.creational.abstractfactory;

public class SamsungCharger implements ChargerCategory {

    private int chargerCode;

    private String chargerName;



    public void setChargerCode(int chargerCode) {
        this.chargerCode = chargerCode;
    }

    @Override
    public int getChargerCode() {
        return chargerCode;
    }

    public void setChargerName(String chargerName) {
        this.chargerName = chargerName;
    }

    @Override
    public String getChargerName() {
        return chargerName;
    }
}
