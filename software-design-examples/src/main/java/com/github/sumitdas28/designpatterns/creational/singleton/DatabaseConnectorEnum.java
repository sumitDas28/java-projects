package com.github.sumitdas28.designpatterns.creational.singleton;

public enum DatabaseConnectorEnum {

    // acquiring instance is thread safe because enums are thread safe by default
    INSTANCE;

    public void connect(){
        System.out.println("connecting to the database enum...");
    }
}
