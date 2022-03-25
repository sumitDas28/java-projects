package com.csv.functional.programming;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FP10Functional {

    public static void main(String[] args) {
        var courses = List.of( "AWS",
                "k8s",
                "Spring",
                "Spring Boot",
                "Quarkus",
                "Node.js",
                "React.js",
                "Spring Data Rest");

        System.out.println(courses.stream().collect(Collectors.joining(",")));
        System.out.println(courses.stream().map(course -> course.split(""))
                                                .flatMap(Arrays::stream)
                                                .distinct()
                                                .collect(Collectors.toList()));
        System.out.println(courses.stream()
                            .peek(System.out::println)
                            .filter(x -> x.length()>5)
                            .map(String::toUpperCase)
                            .peek(System.out::println)
                            .findFirst());
    }
}
