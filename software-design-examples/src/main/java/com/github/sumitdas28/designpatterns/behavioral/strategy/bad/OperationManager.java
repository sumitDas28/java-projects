package com.github.sumitdas28.designpatterns.behavioral.strategy.bad;

public class OperationManager {

    //use composition so that behavior can be changed at runtime
    private Object operation;

    public void setOperation(Object operation) {
        this.operation = operation;
    }

    public void execute(int num1, int num2) {
        // Avoid more if-else as it increases  cyclomatic complexity
        // Avoid casting
       if(operation instanceof Addition){
           Addition addition = (Addition) operation;
           addition.execute(num1,num2);
       } else  if(operation instanceof Multiplication){
           Multiplication multiplication = (Multiplication) operation;
           multiplication.execute(num1,num2);
       }
    }
}
