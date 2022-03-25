package com.csv.functional.programming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FP09CreateStreams {

    public static void main(String[] args) {
        var numbers = List.of(12, 9, 8, 23, 45, 12, 2, 5, 6);
        System.out.println(numbers.stream());

        var numbers2 = Stream.of(12, 9, 8, 23, 45, 12, 2, 5, 6);
        System.out.println(numbers2);

        int[] numberArray = {12, 9, 8, 23, 45, 12, 2, 5, 6};
        System.out.println(Arrays.stream(numberArray));

        // stream of first 100 numbers
        IntStream.rangeClosed(1, 100).forEachOrdered(System.out::println);
        System.out.println("Sum: " + IntStream.range(1,10).sum());

        System.out.println("Sum of 2, 4...10 is "+IntStream.iterate(2, x -> x+2).limit(5).peek(System.out::println).sum());

        System.out.println(IntStream.iterate(2, x -> x*2).limit(5).boxed().collect(Collectors.toList()));

        System.out.println(IntStream.rangeClosed(1, 50).mapToObj(BigInteger::valueOf).reduce(BigInteger.ONE, BigInteger::multiply));

    }
}
