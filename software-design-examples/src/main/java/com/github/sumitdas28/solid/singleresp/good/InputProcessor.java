package com.github.sumitdas28.solid.singleresp.good;

import java.util.Scanner;

public class InputProcessor {

    public static Pair process(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        String firstNum = scanner.nextLine();

        System.out.println("Enter the second number: ");
        String secondNum = scanner.nextLine();


        Pair pair = new Pair(firstNum,secondNum);

        scanner.close();
        return pair;
    }
}
