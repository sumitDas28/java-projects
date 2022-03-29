package com.github.sumitdas28.designpatterns.structural.decorator;

public class App {
    public static void main(String[] args) {
        Beverage coffee = new Sugar(new Milk(new PlainCoffee()));
        System.out.println(coffee.getCost());
        System.out.println(coffee.getDescription());
    }
}
