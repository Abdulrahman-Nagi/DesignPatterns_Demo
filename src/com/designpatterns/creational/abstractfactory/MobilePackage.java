package com.designpatterns.creational.abstractfactory;

public class MobilePackage implements PackageFactory {

    private MobileCategory mobileCategory;

    private  ChargerCategory chargerCategory;

    public MobilePackage(MobileCategory mobile,ChargerCategory charger) {

        this.mobileCategory=mobile;

        this.chargerCategory=charger;
    }

    @Override
    public MobileCategory getMobileType() {
        return mobileCategory;
    }

    @Override
    public ChargerCategory getChargerType() {
        return chargerCategory;
    }
}
