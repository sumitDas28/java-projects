package com.csv.functional.programming;

import java.util.List;
import java.util.stream.Collectors;

// What to do??
public class FP03Functional {

    public static void main(String[] args) {
        var numbers = List.of(2, 4 , 6 , 5, 1, 4, 2);
        System.out.println("Print numbers in the list");
        numbers.stream().forEach(System.out::println);
        System.out.println("Square every number and find sum of squares: "+ numbers.stream().map(x -> x*x).reduce(0, Integer::sum));
        System.out.println("Sum of odd numbers: "+ numbers.stream().filter(x -> x%2 != 0).reduce(0, Integer::sum));

        System.out.println("Print distinct numbers in the list in sorted order");
        numbers.stream().distinct().sorted().forEach(System.out::println);
    }

    private static int sum(int a, int b){
        System.out.println(a + " " + b);
        return a+b;
    }
}
