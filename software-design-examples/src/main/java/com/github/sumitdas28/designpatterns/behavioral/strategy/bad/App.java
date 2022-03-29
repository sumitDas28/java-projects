package com.github.sumitdas28.designpatterns.behavioral.strategy.bad;

public class App {

    public static void main(String[] args) {
        OperationManager operationManager = new OperationManager();
        // Strategy pattern : selecting algorithm at run time
        operationManager.setOperation(new Multiplication());
        operationManager.execute(10,20);
    }
}
