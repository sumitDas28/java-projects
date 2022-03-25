package com.csv.functional.programming;

import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import java.util.function.Supplier;

// What to do??
public class FP07MethodReferences {

    public static void main(String[] args) {
        var courses = List.of("Spring",
                "Spring Boot",
                "Quarkus",
                "Node.js",
                "React.js",
                "AWS",
                "k8s",
                "Spring Data Rest");

        courses.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

        //contsructor refernce
        Supplier<String> supplier = () -> new String();
        Supplier<String> supplier1 = String::new;

    }
}
