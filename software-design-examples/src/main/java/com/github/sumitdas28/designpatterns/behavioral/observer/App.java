package com.github.sumitdas28.designpatterns.behavioral.observer;

public class App {

    public static void main(String[] args) {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver1 weatherObserver1 = new WeatherObserver1(weatherStation);
        WeatherObserver2 weatherObserver2 = new WeatherObserver2(weatherStation);


        weatherStation.setPressure(10);
        weatherStation.setTemperature(20);
        weatherStation.setHumidity(30);
    }
}
