package com.github.sumitdas28.solid.interfacesegr.bad;

public class CEO implements Employee{
    @Override
    public void salary() {
        System.out.println("CEO salary details");
    }

    @Override
    public void hire() {
        System.out.println("CEO not involved in hiring");
    }

    @Override
    public void train() {
        System.out.println("CEO not involved in training");
    }

    @Override
    public void addBonus() {
        System.out.println("CEO to add bonus");
    }

    @Override
    public void makeDecisions() {
        System.out.println("CEO makes major decisions");
    }

    @Override
    public void addStocks() {
        System.out.println("CEO can add stocks");
    }
}
