package com.github.sumitdas28.solid.depinversion.bad;

// another low level module - specific implementation
public class OracleDatabase {

    public  void connect(){
        System.out.println("Connecting to a Oracle database...");
    }

    public  void disConnect(){
        System.out.println("Disconnecting the Oracle database...");
    }
}
