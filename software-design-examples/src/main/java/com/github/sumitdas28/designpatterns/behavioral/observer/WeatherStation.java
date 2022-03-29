package com.github.sumitdas28.designpatterns.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherStation implements Subject{

    private int pressure;
    private int temperature;
    private int humidity;

    List<Observer> observerList;

    public WeatherStation() {
        observerList = new ArrayList<>();
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
        notifyAllObserver();
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        notifyAllObserver();
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
        notifyAllObserver();
    }

    @Override
    public void addObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observerList.remove(o);
    }

    @Override
    public void notifyAllObserver() {
        observerList.stream()
                .forEach(x -> x.update(pressure,temperature,humidity));
    }
}
