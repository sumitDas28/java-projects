package com.github.sumitdas28.designpatterns.creational.abstractfactory;

public class ToyotaPetrol implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling an Petrol Toyota...");
    }
}
