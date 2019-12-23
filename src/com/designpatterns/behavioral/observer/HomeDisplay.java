package com.designpatterns.behavioral.observer;

public class HomeDisplay implements IObservers {


    WeatherStation weatherStation;



    public HomeDisplay(WeatherStation weatherStation) {

        this.weatherStation=weatherStation;
    }

    @Override
    public void update() {

        System.out.println("Temp of Home Display is --> "  + this.weatherStation.getWeatherTemp() );


    }
}
