package com.github.sumitdas28.designpatterns.creational.prototype;

public class App {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10,20);
        rectangle.draw();

        Shape rectangleClone = rectangle.cloneObject();
        rectangleClone.draw();
    }
}
