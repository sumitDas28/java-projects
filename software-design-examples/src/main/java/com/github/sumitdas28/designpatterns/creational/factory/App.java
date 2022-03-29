package com.github.sumitdas28.designpatterns.creational.factory;

public class App {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal(AnimalType.DOG);
        dog.eat();

        Animal lion = AnimalFactory.getAnimal(AnimalType.LION);
        lion.eat();
    }
}
