package com.github.sumitdas28.designpatterns.creational.abstractfactory;

public class App {

    public static void main(String[] args) {
        AbstractCarFactory electricCarFactory = FactoryProducer.getCarFactory("ELECTRIC");
        electricCarFactory.getCar("TOYOTA").assemble();

        AbstractCarFactory petrolCarFactory = FactoryProducer.getCarFactory("PETROL");
        petrolCarFactory.getCar("HYUNDAI").assemble();
    }
}
