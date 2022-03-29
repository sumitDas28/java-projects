package com.github.sumitdas28.solid.singleresp.bad;

import java.util.Scanner;

public class BadDesignExample1 {

    public static void main(String[] args) {
        System.out.println("Welcome to the Bad Design Application!");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstNum = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondNum = scanner.nextLine();

        scanner.close();

        int firstInt = 0;
        int secondInt = 0;

        if(firstNum==null){
            System.out.println("First number is not valid...");
            return;
        }

        try{
            firstInt = Integer.parseInt(firstNum);
        } catch (NumberFormatException nfe){
            System.out.println("First number is not valid...");
            return;
        }

        if(secondNum==null){
            System.out.println("Second number is not valid...");
            return;
        }

        try{
            secondInt = Integer.parseInt(secondNum);
        } catch (NumberFormatException nfe){
            System.out.println("Second number is not valid...");
            return;
        }

        int result = firstInt+secondInt;

        System.out.println("The result is : "+result);
        System.out.println("End of the application!");


    }
}
