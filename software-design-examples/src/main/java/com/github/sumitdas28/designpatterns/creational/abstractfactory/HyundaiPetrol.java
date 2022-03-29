package com.github.sumitdas28.designpatterns.creational.abstractfactory;

public class HyundaiPetrol implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling an Petrol Hyundai...");
    }
}
