package com.github.sumitdas28.solid.liskovsubs.good2;

public class ElectricCar extends Vehicle {
    public ElectricCar(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected void speedUp(){
        System.out.println("ElectricCar is speeding up...");
    }

    @Override
    protected  void slowDown(){
        System.out.println("ElectricCar is slowing down...");
    }

    @Override
    public void refuel(){
        System.out.println("ElectricCar is recharging...");
    }
}
