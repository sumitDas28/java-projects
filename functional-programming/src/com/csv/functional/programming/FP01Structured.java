package com.csv.functional.programming;

import java.util.List;

public class FP01Structured {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 8, 23, 45, 12, 2, 5, 6);
        printAllNumberInListStructured(numbers);
        printEvenNumberInListStructured(numbers);

    }

    private static void printEvenNumberInListStructured(List<Integer> numbers) {
        for (Integer number: numbers){
            if(number % 2 == 0){
                System.out.println("Even Number Structured: " + number);
            }
        }
    }

    private static void printAllNumberInListStructured(List<Integer> numbers) {
        // How??
        for (Integer number: numbers){
            System.out.println("Number Structured: " + number);
        }
    }
}
