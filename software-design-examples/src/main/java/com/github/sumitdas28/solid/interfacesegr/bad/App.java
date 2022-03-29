package com.github.sumitdas28.solid.interfacesegr.bad;

public class App {
    public static void main(String[] args) {
        Employee e1 = new Worker();
        e1.salary();
        e1.hire();

        Employee e2 = new Manager();
        e2.hire();
        e2.addBonus();
        e2.makeDecisions();


        Employee e3 = new CEO();
        e3.salary();
        e3.addBonus();
        e3.makeDecisions();
    }
}
