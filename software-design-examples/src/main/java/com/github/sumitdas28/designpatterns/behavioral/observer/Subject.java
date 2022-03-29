package com.github.sumitdas28.designpatterns.behavioral.observer;

public interface Subject {

    public void addObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyAllObserver();
}
