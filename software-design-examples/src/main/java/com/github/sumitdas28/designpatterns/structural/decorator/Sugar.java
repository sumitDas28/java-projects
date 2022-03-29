package com.github.sumitdas28.designpatterns.structural.decorator;

public class Sugar extends BeverageDecorator{
    public Sugar(Beverage beverage) {
        super(beverage);
    }

    @Override
    public int getCost() {
        return super.getCost()+1;
    }

    @Override
    public String getDescription() {
        return super.getDescription()+ " + 1-Sugar";
    }
}
