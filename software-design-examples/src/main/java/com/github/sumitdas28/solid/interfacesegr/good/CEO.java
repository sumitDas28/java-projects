package com.github.sumitdas28.solid.interfacesegr.good;

public class CEO implements ICEO {
    @Override
    public void salary() {
        System.out.println("CEO salary details");
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
