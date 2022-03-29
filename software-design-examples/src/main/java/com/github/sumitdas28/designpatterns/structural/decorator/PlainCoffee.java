package com.github.sumitdas28.designpatterns.structural.decorator;

public class PlainCoffee implements Beverage{

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "Plain Coffee";
    }
}
