package com.github.sumitdas28.solid.interfacesegr.good;

public class Manager implements IManager {
    @Override
    public void salary() {
        System.out.println("Manager salary details");
    }

    @Override
    public void hire() {
        System.out.println("Manager does hiring");
    }

    @Override
    public void train() {
        System.out.println("Manager does training");
    }

    @Override
    public void addBonus() {
        System.out.println("Manager to add bonus");
    }
}
