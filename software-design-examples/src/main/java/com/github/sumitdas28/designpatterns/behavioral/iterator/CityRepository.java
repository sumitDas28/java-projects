package com.github.sumitdas28.designpatterns.behavioral.iterator;

public class CityRepository {

    private String[] cities = {"Berlin", "Dubai", "Paris"};

    public Iterator getIterator(){
        return new CityIterator(cities);
    }
}
