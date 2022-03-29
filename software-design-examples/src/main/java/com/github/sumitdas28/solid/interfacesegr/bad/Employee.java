package com.github.sumitdas28.solid.interfacesegr.bad;

public interface Employee {
    //Fat interface

    // CEO + managers + workers
    public void salary();
    // managers
    public void hire();
    public void train();
    // CEO + managers
    public void addBonus();
    // CEO
    public void makeDecisions();
    public void addStocks();
}
