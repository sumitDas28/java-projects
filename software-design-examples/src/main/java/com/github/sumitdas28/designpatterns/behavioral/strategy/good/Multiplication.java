package com.github.sumitdas28.designpatterns.behavioral.strategy.good;

public class Multiplication implements MathOperation{
    @Override
    public void execute(int num1, int num2) {
        System.out.println("Multiplication: "+ (num1*num2));
    }
}
