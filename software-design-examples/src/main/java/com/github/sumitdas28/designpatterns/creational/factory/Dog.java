package com.github.sumitdas28.designpatterns.creational.factory;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog is eating...");
    }
}
