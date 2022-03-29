package com.github.sumitdas28.designpatterns.structural.decorator;

public class Milk extends BeverageDecorator{
    public Milk(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost()+3;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+" + 1-Milk";
    }
}
