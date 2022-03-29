package com.github.sumitdas28.designpatterns.behavioral.nullobject;

public class App {
    public static void main(String[] args) {
        CityRepository cityRepository = new CityRepository();
        CityFactory cityFactory = new CityFactory();
        System.out.println(cityFactory.getCity("Montreal").getCity());
        System.out.println(cityFactory.getCity("London").getCity());
    }
}
