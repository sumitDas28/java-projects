package com.csv.functional.programming;

import java.util.List;

// What to do??
public class FP01Functional {

    public static void main(String[] args) {
        var numbers = List.of(12, 9, 8, 23, 45, 12, 2, 5, 6);

        System.out.println("Print All numbers");
        numbers.stream().forEach(System.out::println); //Method Reference
        System.out.println("Print Even Numbers");
        numbers.stream().filter(number -> number % 2 == 0) //Lambda expression
               .forEach(System.out::println);
        System.out.println("Print Odd numbers");
        numbers.stream().filter(number -> number % 2 != 0)
               .forEach(System.out::println);

        System.out.println("Print Squares of Even Numbers");
        numbers.stream().filter(number -> number % 2 == 0)
                .map(number -> number * number)
               .forEach(System.out::println);

        var courses = List.of("Spring",
                              "Spring Boot",
                              "Quarkus",
                              "Node.js",
                              "React.js",
                              "AWS",
                              "k8s",
                              "Spring Data Rest");

        System.out.println("Print All courses");
        courses.stream().forEach(System.out::println);
        System.out.println("Print courses containing Spring");
        courses.stream().filter(course -> course.contains("Spring"))
               .forEach(System.out::println);

        System.out.println("Print number of characters in each course");
        courses.stream().map(course -> "Number of characters in " + course + " is " + course.length())
               .forEach(System.out::println);
    }
}
