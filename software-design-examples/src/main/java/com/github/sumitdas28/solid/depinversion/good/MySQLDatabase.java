package com.github.sumitdas28.solid.depinversion.good;

// low level module - specific implementation
public class MySQLDatabase implements Database{

    @Override
    public void connect() {
        System.out.println("Connecting to a MySQL database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting the Oracle database...");
    }
}
