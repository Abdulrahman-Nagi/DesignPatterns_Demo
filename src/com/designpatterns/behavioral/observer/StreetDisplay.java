package com.designpatterns.behavioral.observer;

public class StreetDisplay implements IObservers {


    WeatherStation weatherStation;



    public StreetDisplay(WeatherStation weatherStation) {

        this.weatherStation=weatherStation;
    }

    @Override
    public void update() {

        System.out.println("Temp of Street Display is --> "  + this.weatherStation.getWeatherTemp() );


    }


}
