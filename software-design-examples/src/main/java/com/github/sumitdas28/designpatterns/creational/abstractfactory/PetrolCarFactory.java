package com.github.sumitdas28.designpatterns.creational.abstractfactory;

public class PetrolCarFactory implements AbstractCarFactory{
    @Override
    public Car getCar(String type) {
        if(type=="HYUNDAI"){
            return new HyundaiPetrol();
        } else if(type=="TOYOTA"){
            return new ToyotaPetrol();
        }
        return null;
    }
}
