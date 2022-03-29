package com.github.sumitdas28.designpatterns.creational.builder;

public class App {

    public static void main(String[] args) {
        Person person = new Person.Builder("Tom","tom@gmail.com")
                        .setAddress("Avenue Road")
                        .setAge(30)
                        .build();

        System.out.println(person);

        Student student = new Student.Builder("Harry", "Harvard")
                            .setAge(20)
                            .build();

        System.out.println(student);
    }
}
