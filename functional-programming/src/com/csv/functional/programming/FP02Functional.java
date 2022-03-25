package com.csv.functional.programming;

import java.util.List;

// What to do??
public class FP02Functional {

    public static void main(String[] args) {
        var numbers = List.of(12, 9, 8, 23, 45, 12, -2, 5, 6);
        System.out.println("Sum of all numbers: " + numbers.stream().reduce(0, Integer::sum));
        System.out.println("Sum of all numbers: " + numbers.stream().reduce(0, FP02Functional::sum));

        System.out.println("Max of all numbers: " + numbers.stream().reduce(Integer.MIN_VALUE, Integer::max));
        System.out.println("Min of all numbers: " + numbers.stream().reduce(Integer.MAX_VALUE, Integer::min));
    }

    private static int sum(int a, int b){
        System.out.println(a + " " + b);
        return a+b;
    }
}
