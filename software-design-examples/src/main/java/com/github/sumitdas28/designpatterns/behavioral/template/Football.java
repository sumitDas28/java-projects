package com.github.sumitdas28.designpatterns.behavioral.template;

public class Football extends Game{
    @Override
    protected void initializeGame() {
        System.out.println("Initializing Football game...");
    }

    @Override
    protected void playGame() {
        System.out.println("Playing Football game...");
    }

    @Override
    protected void showResults() {
        System.out.println("Showing results for Football game...");
    }
}
