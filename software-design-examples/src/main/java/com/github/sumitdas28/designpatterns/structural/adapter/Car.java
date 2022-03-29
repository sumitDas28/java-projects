package com.github.sumitdas28.designpatterns.structural.adapter;

public class Car implements Vehicle{
    @Override
    public void accelerate() {
        System.out.println("Car is accelerating...");
    }
}
