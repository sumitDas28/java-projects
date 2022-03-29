package com.github.sumitdas28.designpatterns.behavioral.command;

import java.util.ArrayList;
import java.util.List;

//Invoker
public class Switcher {

    private List<Command> commands;

    public Switcher() {
        this.commands= new ArrayList<>();
    }

    public void addCommand(Command c){
        commands.add(c);
    }

    public void executeCommands(){
        commands.stream().forEach(x -> x.execute());
    }
}
