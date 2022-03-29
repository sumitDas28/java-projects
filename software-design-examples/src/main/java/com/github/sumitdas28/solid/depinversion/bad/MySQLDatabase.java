package com.github.sumitdas28.solid.depinversion.bad;

// low level module - specific implementation
public class MySQLDatabase {

    public  void connect(){
        System.out.println("Connecting to a MySQL database...");
    }

    public  void disConnect(){
        System.out.println("Disconnecting the MySQL database...");
    }
}
