package com.github.sumitdas28.solid.liskovsubs.good2;

public class PetrolCar extends Vehicle {
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
    public void refuel(){
        System.out.println("PetrolCar is refuelling....");
    }
}
