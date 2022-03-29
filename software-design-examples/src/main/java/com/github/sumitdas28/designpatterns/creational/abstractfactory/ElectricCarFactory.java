package com.github.sumitdas28.designpatterns.creational.abstractfactory;

public class ElectricCarFactory implements AbstractCarFactory{
    @Override
    public Car getCar(String type) {
        if(type=="HYUNDAI"){
            return new HyundaiElectric();
        } else if(type=="TOYOTA"){
            return new ToyotaElectric();
        }
        return null;
    }
}
