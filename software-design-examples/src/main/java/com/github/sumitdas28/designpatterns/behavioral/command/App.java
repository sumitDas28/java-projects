package com.github.sumitdas28.designpatterns.behavioral.command;

public class App {

    public static void main(String[] args) {
        Switcher switcher = new Switcher();
        Light light = new Light();
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);
        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        //Client
        switcher.addCommand(turnOnCommand);
        switcher.addCommand(turnOffCommand);
        switcher.executeCommands();
    }
}
