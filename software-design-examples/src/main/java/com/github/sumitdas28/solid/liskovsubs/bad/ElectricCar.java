package com.github.sumitdas28.solid.liskovsubs.bad;

public class ElectricCar extends Vehicle{
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
    protected void refuel(){
       throw new Error("ElectricCars cannot be fueled...");
    }
}
