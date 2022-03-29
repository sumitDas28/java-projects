package com.github.sumitdas28.designpatterns.creational.prototype;

public abstract class Shape {

    protected int length;
    protected int width;

    public Shape(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public abstract void draw();

    public abstract Shape cloneObject();

}
