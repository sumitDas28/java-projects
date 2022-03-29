package com.github.sumitdas28.designpatterns.creational.abstractfactory;

public class HyundaiElectric implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling an Electric Hyundai...");
    }
}
