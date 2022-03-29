package com.github.sumitdas28.designpatterns.behavioral.nullobject;

public class NullCity extends AbstractCity{
    @Override
    public boolean isNull() {
        return true;
    }

    @Override
    public String getCity() {
        return "No City exists with the given city name in the repository";
    }
}
