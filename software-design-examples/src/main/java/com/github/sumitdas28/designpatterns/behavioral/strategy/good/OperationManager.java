package com.github.sumitdas28.designpatterns.behavioral.strategy.good;

public class OperationManager {

    //use composition so that behavior can be changed at runtime
    private MathOperation operation;

    public void setOperation(MathOperation operation) {
        this.operation = operation;
    }

    public void execute(int num1, int num2) {
       this.operation.execute(num1,num2);
    }
}
