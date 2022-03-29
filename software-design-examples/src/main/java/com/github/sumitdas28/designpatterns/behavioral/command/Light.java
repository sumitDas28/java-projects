package com.github.sumitdas28.designpatterns.behavioral.command;

//Receiver
public class Light {

    public void turnOn(){
        System.out.println("Lights are ON....");
    }

    public void turnOff(){
        System.out.println("Lights are OFF....");
    }
}
