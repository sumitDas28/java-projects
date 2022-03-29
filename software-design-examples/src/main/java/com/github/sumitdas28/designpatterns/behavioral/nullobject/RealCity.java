package com.github.sumitdas28.designpatterns.behavioral.nullobject;

public class RealCity extends AbstractCity{

    public RealCity(String cityName) {
        this.cityName = cityName;
    }

    @Override
    public boolean isNull() {
        return false;
    }

    @Override
    public String getCity() {
        return this.cityName;
    }
}
