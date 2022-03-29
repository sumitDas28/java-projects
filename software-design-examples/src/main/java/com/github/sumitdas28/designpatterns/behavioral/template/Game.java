package com.github.sumitdas28.designpatterns.behavioral.template;

public abstract class Game {

    protected abstract void initializeGame();
    protected abstract void playGame();
    protected abstract void showResults();

    //Template pattern
    // subclasses cannot override
    public final void play(){
        initializeGame();
        playGame();
        showResults();
    }
}
