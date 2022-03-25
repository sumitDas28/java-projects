package com.csv.functional.programming;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class FP12Functional {
    public static void main(String[] args) throws IOException {
        var courses = List.of("Spring",
                "Spring Boot",
                "Quarkus",
                "Node.js",
                "React.js",
                "AWS",
                "k8s",
                "Spring Data Rest");
        var modifiableCourses = new ArrayList<>(courses);
        modifiableCourses.replaceAll(s -> s.toUpperCase());
        System.out.println(modifiableCourses);
        modifiableCourses.removeIf(s -> s.length()<4);
        System.out.println(modifiableCourses);

        Files.lines(Paths.get("/Users/m_2094610/IdeaProjects/JavaProjects/functional-programming/file.txt"))
                    .forEach(System.out::println);

        Files.lines(Paths.get("/Users/m_2094610/IdeaProjects/JavaProjects/functional-programming/file.txt"))
                .map(s -> s.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Files.list(Paths.get("/Users/m_2094610/IdeaProjects/JavaProjects/functional-programming"))
                .filter(Files::isDirectory)
                .forEach(System.out::println);
    }
}
