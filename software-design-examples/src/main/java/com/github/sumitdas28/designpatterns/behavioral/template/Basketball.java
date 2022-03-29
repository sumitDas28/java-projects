package com.github.sumitdas28.designpatterns.behavioral.template;

public class Basketball extends Game{
    @Override
    protected void initializeGame() {
        System.out.println("Initializing Basketball game...");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing Basketball game...");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing results for Basketball game...");
    }
}
