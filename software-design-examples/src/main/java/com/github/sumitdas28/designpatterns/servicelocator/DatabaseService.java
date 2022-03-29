package com.github.sumitdas28.designpatterns.servicelocator;

public class DatabaseService implements Service{

    public  static final String NAME="DATABASE_SERVICE";

    @Override
    public String getName() {
        return DatabaseService.NAME;
    }

    @Override
    public void execute() {
        System.out.println("Executing DatabaseService...");
    }
}
