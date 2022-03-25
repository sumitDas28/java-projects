package com.csv.functional.programming;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// What to do??
public class FP04Functional {

    public static void main(String[] args) {
        var courses = List.of("Spring",
                              "Spring Boot",
                              "Quarkus",
                              "Node.js",
                              "React.js",
                              "AWS",
                              "k8s",
                              "Spring Data Rest");
        System.out.println("print in reverse order");
        courses.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);

        System.out.println("print in order by length");
        courses.stream().sorted(Comparator.comparing(str -> str.length())).forEach(System.out::println);

        System.out.println("Create a List with lengths of all course titles");
        List<Integer> coursetitleLengthList = courses.stream().map(x -> x.length()).collect(Collectors.toList());
        coursetitleLengthList.stream().forEach(System.out::println);
    }

    private static int sum(int a, int b){
        System.out.println(a + " " + b);
        return a+b;
    }
}
