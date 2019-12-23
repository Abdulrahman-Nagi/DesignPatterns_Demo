package com.designpatterns.behavioral.observer;

public interface IObservable {

    void add(IObservers observer);

    void remove(IObservers observer);

    void notifyObservers();
}
