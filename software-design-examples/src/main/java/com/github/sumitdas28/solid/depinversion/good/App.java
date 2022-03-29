package com.github.sumitdas28.solid.depinversion.good;

public class App {

    public static void main(String[] args) {

        DatabaseController databaseController = new DatabaseController(new OracleDatabase());
        databaseController.connect();
        databaseController.disconnect();
    }
}
