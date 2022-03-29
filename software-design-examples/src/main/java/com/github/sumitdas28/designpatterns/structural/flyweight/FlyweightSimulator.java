package com.github.sumitdas28.designpatterns.structural.flyweight;

import java.util.Random;

public class FlyweightSimulator {
    private Random random;
    private ShapeFactory shapeFactory;
    private String[] colors = {"RED", "GREEN","BLUE"};

    public FlyweightSimulator() {
        this.shapeFactory = new ShapeFactory();
        random = new Random();
    }

    public void run(){
        for (int i=0; i<30; i++){
            Rectangle rectangle = (Rectangle) shapeFactory.getShape(getRandomColor());
            rectangle.setX(getRandomCoordinate());
            rectangle.setY(getRandomCoordinate());
            rectangle.draw();
        }
    }

    private String getRandomColor() {
        return colors[random.nextInt(3)];
    }

    private int getRandomCoordinate() {
        return random.nextInt(50);
    }
}
