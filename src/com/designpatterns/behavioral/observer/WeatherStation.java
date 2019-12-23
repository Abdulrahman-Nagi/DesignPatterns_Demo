package com.designpatterns.behavioral.observer;



import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements IObservable{

    private int weatherTemp;

    private List<IObservers> observers = new ArrayList<>();



    @Override
    public void add(IObservers observer) {
        this.observers.add(observer);
    }

    @Override
    public void remove(IObservers observer) {

        this.observers.remove(observer);

    }

    @Override
    public void notifyObservers() {

        for (IObservers observers : this.observers) {

            observers.update();
        }

    }

    public int getWeatherTemp() {
        return weatherTemp;
    }

    public void setWeatherTemp(int weatherTemp) {
        this.weatherTemp = weatherTemp;
    }
}
