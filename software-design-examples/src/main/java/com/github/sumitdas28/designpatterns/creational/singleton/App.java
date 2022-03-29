package com.github.sumitdas28.designpatterns.creational.singleton;

public class App {

    public static void main(String[] args) {
       DatabaseConnectorEager.getInstance().connect();
       DatabaseConnectorLazy.getInstance().connect();

       DatabaseConnectorLazy lazy1 = DatabaseConnectorLazy.getInstance();
       DatabaseConnectorLazy lazy2 = DatabaseConnectorLazy.getInstance();

       if(lazy1==lazy2)
           System.out.println("The lazy objects are same");


       DatabaseConnectorEnum.INSTANCE.connect();
       DatabaseConnectorEnum enum1 = DatabaseConnectorEnum.INSTANCE;
        DatabaseConnectorEnum enum2 = DatabaseConnectorEnum.INSTANCE;

        if(enum1==enum2)
            System.out.println("the enum objects are same");
    }
}
