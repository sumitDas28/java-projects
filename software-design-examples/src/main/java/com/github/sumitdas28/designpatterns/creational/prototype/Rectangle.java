package com.github.sumitdas28.designpatterns.creational.prototype;

public class Rectangle extends Shape{
    public Rectangle(int length, int width) {
        super(length, width);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with length: "+length+" and width: "+width);
    }

    @Override
    public Shape cloneObject() {
        // this is the Prototype pattern without using the Cloneable interface
        return new Rectangle(length,width);
    }
}
