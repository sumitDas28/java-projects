package com.github.sumitdas28.designpatterns.creational.abstractfactory;

public class FactoryProducer {

    public static AbstractCarFactory getCarFactory(String factoryType){
        if(factoryType=="ELECTRIC"){
            return new ElectricCarFactory();
        } else if(factoryType=="PETROL"){
            return new PetrolCarFactory();
        }
        return null;
    }
}
