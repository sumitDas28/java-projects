package com.github.sumitdas28.designpatterns.behavioral.observer;

public class WeatherObserver1 implements Observer{

    private int pressure;
    private int temperature;
    private int humidity;
    private Subject subject;

    public WeatherObserver1(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        showData();
    }

    private void showData() {
        System.out.println("WeatherObserver1 data: Pressure=" + pressure + " Temperature:" + temperature + " Humidity:" + humidity);
    }
}
