package com.github.sumitdas28.designpatterns.behavioral.iterator;

public class CityIterator implements Iterator {

    private String[] cities;
    private int index;

    public CityIterator(String[] cities) {
        this.cities = cities;
    }

    @Override
    public boolean hasNext() {
        return index < cities.length;
    }

    @Override
    public Object next() {
        if (hasNext()) {
            return this.cities[index++];
        }
        return null;
    }
}
