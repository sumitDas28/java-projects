package com.csv.functional.programming;

import java.util.List;

public class FP02Structured {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(12, 9, 8, 23, 45, 12, 2, 5, 6);
        int sum = addListStructured(numbers);
        System.out.println(sum);

    }

    private static int addListStructured(List<Integer> numbers) {
        int sum = 0;
        for(Integer number : numbers){
            sum = sum + number;
        }
        return sum;
    }
}