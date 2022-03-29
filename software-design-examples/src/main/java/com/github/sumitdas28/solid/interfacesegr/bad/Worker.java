package com.github.sumitdas28.solid.interfacesegr.bad;

public class Worker implements Employee{
    @Override
    public void salary() {
        System.out.println("Worker salary details");
    }

    @Override
    public void hire() {
        System.out.println("Working not applicable hiring");
    }

    @Override
    public void train() {
        System.out.println("Working not applicable  training");
    }

    @Override
    public void addBonus() {
        System.out.println("Working not applicable  add bonus");
    }

    @Override
    public void makeDecisions() {
        System.out.println("Working not applicable  in major decisions");
    }

    @Override
    public void addStocks() {
        System.out.println("Working not applicable  add stocks");
    }
}
