package com.github.sumitdas28.designpatterns.creational.singleton;

public class DatabaseConnectorLazy {
    // lazy version
    private static DatabaseConnectorLazy INSTANCE;

    // problem: new instance can be created using reflection
    private DatabaseConnectorLazy(){
    }

   public static DatabaseConnectorLazy getInstance(){
        if(INSTANCE==null){
            // if we have multiple threads
            synchronized (DatabaseConnectorLazy.class){
                // this block can be entered by a single thread
                // problem: it is too slow (100x)
                INSTANCE = new DatabaseConnectorLazy();
            }
        }
        return INSTANCE;
   }

   public void connect(){
       System.out.println("connecting to the database lazy...");
   }
}
