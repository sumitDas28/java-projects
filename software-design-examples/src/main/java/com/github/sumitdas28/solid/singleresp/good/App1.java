package com.github.sumitdas28.solid.singleresp.good;

public class App1 {

    public static void main(String[] args) {
        System.out.println("Welcome to the Good Design Application!");

        //Step: we get the values
        Pair pair = InputProcessor.process();

        //Step: Validation
        if(!Validation.isValid(pair)){
            System.out.println("Input is inavlid...");
            return;
        }

        int firstInt = Integer.parseInt(pair.getFirstNum());
        int secondInt = Integer.parseInt(pair.getSecondNum());

        //Step Mathematical Operation
        int result = Operation.execute(firstInt,secondInt);

        System.out.println("The result is : "+result);
        System.out.println("End of the application!");


    }
}
