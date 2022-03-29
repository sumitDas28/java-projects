package com.github.sumitdas28.solid.liskovsubs.bad;

public class PetrolCar extends Vehicle{
    public PetrolCar(int year, String make, String model) {
        super(year, make, model);
    }

    @Override
    protected void speedUp(){
        System.out.println("PetrolCar is speeding up...");
    }

    @Override
    protected  void slowDown(){
        System.out.println("PetrolCar is slowing down...");
    }

    @Override
    protected void refuel(){
        System.out.println("PetrolCar is refuelling....");
    }
}
