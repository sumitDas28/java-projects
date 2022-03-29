package com.github.sumitdas28.designpatterns.creational.singleton;

public class DatabaseConnectorEager {
    // Eager version
    private static DatabaseConnectorEager INSTANCE = new DatabaseConnectorEager();

    private DatabaseConnectorEager(){
        //singleton
    }

   public static DatabaseConnectorEager getInstance(){
       return INSTANCE;
   }

   public void connect(){
       System.out.println("connecting to the database eager...");
   }
}
