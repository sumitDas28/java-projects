package com.github.sumitdas28.solid.liskovsubs.good2;

public abstract class Vehicle implements Refuel{

    protected int year;
    protected String make;
    protected String model;

    public Vehicle(int year, String make, String model) {
        this.year = year;
        this.make = make;
        this.model = model;
    }

    protected void speedUp(){
        System.out.println("Vehicle is speeding up...");
    }

    protected  void slowDown(){
        System.out.println("Vehicle is slowing down...");
    }
}
