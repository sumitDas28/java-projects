package com.csv.functional.programming;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

// What to do??
public class FP06BehaviorParameterization {

    public static void main(String[] args) {
        var numbers = List.of(12, 9, 8, 23, 45, 12, 2, 5, 6);
        filterAndPrint(numbers, x -> x % 2 == 0);
        filterAndPrint(numbers, x -> x % 2 != 0);
        filterAndPrint(numbers, x -> x % 3 == 0);

    }

    private static void filterAndPrint(List<Integer> numbers, Predicate<Integer> filter) {
        numbers.stream()
               .filter(filter)
               .forEach(System.out::println);
    }
}
