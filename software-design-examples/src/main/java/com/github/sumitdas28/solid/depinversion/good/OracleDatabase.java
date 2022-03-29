package com.github.sumitdas28.solid.depinversion.good;

// another low level module - specific implementation
public class OracleDatabase implements Database{


    @Override
    public void connect() {
        System.out.println("Connecting to a Oracle database...");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting the Oracle database...");
    }
}
