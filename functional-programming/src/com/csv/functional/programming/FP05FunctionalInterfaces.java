package com.csv.functional.programming;

import java.util.Comparator;
import java.util.List;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

// What to do??
public class FP05FunctionalInterfaces {

    public static void main(String[] args) {
        var numbers = List.of(12, 9, 8, 23, 45, 12, 2, 5, 6);
        Predicate<Integer> isEvenPredicate = x -> x % 2 == 0;
        Predicate<Integer> isEvenPredicate2 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer x) {
                return x % 2 == 0;
            }
        };
        Function<Integer, Integer> squareFunction = x -> x*x;
        Function<Integer, Integer> squareFunction2 = new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer x) {
                return x*x;
            }
        };
        Consumer<Integer> printConsumer = System.out::println;
        Consumer<Integer> printConsumer2 = new Consumer<Integer>() {
            @Override
            public void accept(Integer x) {
                System.out.println(x);
            }
        };
        numbers.stream()
               .filter(isEvenPredicate2)
               .map(squareFunction2)
               .forEach(printConsumer2);

        BinaryOperator<Integer> sumBinaryOperator = new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer a, Integer b) {
                return a+b;
            }
        };
        BinaryOperator<Integer> sumBinaryOperator2 = (x,y) -> x+y;
        int sum = numbers.stream().reduce(0, sumBinaryOperator2);
        System.out.println("Sum: "+ sum);

        //Supplier : no input return something. Example Factory pattern
        Supplier<Integer> randonIntSupplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                Random random = new Random();
                return random.nextInt();
            }
        };
        Supplier<Integer> randonIntSupplier2 = () -> {
            Random random = new Random();
            return random.nextInt();
        };
        System.out.println(randonIntSupplier2.get());

        //UnaryOperator
        UnaryOperator<Integer> unaryOperator = x -> 3*x;
        System.out.println(unaryOperator.apply(2));

        //BiPredicate
        BiPredicate<Integer,Integer> biPredicateEquals = (x,y) -> x==y;
        System.out.println(biPredicateEquals.test(2,3));

        BiFunction<Integer, Integer, Integer> biFunctionSum = (x,y) -> x+y;
        System.out.println(biFunctionSum.apply(2,3));

        BiConsumer<String,String> biConsumer = (x,y) -> System.out.println(x+" "+y+"!");
        biConsumer.accept("Hello","World");

        IntConsumer intConsumer = x -> System.out.println(x);
        intConsumer.accept(10);
    }
}
