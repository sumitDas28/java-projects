package com.github.sumitdas28.solid.interfacesegr.bad;

public class Manager implements Employee{
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

    @Override
    public void makeDecisions() {
        System.out.println("Manager not involved in major decisions");
    }

    @Override
    public void addStocks() {
        System.out.println("Manager can not add stocks");
    }
}
