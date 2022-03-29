package com.github.sumitdas28.designpatterns.creational.factory;

public class AnimalFactory {
    public static Animal getAnimal(AnimalType type){
        if(type==AnimalType.CAT){
            return new Cat();
        } else if(type==AnimalType.DOG){
            return  new Dog();
        } else if(type==AnimalType.LION){
            return new Lion();
        }
        return null;
    }
}
