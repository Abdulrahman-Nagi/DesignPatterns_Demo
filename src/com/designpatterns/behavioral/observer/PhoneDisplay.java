package com.designpatterns.behavioral.observer;

public class PhoneDisplay implements IObservers {


    WeatherStation weatherStation;



    public PhoneDisplay(WeatherStation weatherStation) {

        this.weatherStation=weatherStation;
    }

    @Override
    public void update() {

        System.out.println("Temp of PhoneDisplay is ----> " + this.weatherStation.getWeatherTemp());


    }
}
