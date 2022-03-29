package com.github.sumitdas28.solid.depinversion.good;

// high level module
public class DatabaseController {

    //loosely coupled architecture
    private Database database;

    public DatabaseController(Database database) {
       this.database = database;
    }

    public void connect() {
        database.connect();
    }
    public void disconnect() {
        database.disconnect();
    }
}
