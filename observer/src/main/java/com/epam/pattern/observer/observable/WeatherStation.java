package com.epam.pattern.observer.observable;

import com.epam.pattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Observable {

    private List<Observer> observers = new ArrayList<Observer>();
    private float temperature;
    private float humidity;

    public void setMeasurements(float temperature, float humidity) {
        this.temperature = temperature;
        this.humidity = humidity;
        notifyObservers();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    // observer part below

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }
}
