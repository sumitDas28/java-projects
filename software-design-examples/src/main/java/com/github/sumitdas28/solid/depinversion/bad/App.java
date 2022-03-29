package com.github.sumitdas28.solid.depinversion.bad;

public class App {

    public static void main(String[] args) {
        new DatabaseController("oracle");
    }
}
