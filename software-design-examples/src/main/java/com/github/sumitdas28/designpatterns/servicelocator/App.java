package com.github.sumitdas28.designpatterns.servicelocator;

public class App {
    public static void main(String[] args) {
        Service dbService = ServiceLocator.getService("DATABASE_SERVICE");
        dbService.execute();

        Service msgService = ServiceLocator.getService("MESSAGING_SERVICE");
        msgService.execute();
    }
}
