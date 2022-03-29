package com.github.sumitdas28.solid.interfacesegr.good;

public class App {
    public static void main(String[] args) {
        IEmployee e1 = new Worker();
        e1.salary();

        IManager e2 = new Manager();
        e2.salary();
        e2.hire();
        e2.addBonus();


        ICEO e3 = new CEO();
        e3.salary();
        e3.addBonus();
        e3.makeDecisions();
    }
}
