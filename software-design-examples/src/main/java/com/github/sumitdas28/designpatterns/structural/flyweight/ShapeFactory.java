package com.github.sumitdas28.designpatterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private Map<String, Shape> shapes;

    public ShapeFactory() {
        this.shapes = new HashMap<>();
    }

    public Shape getShape(String color){
        if(shapes.containsKey(color)){
            return shapes.get(color);
        } else{
            System.out.println("Creating a new rectangle with color "+color);
            Shape shape = new Rectangle(color);
            shapes.put(color,shape);
            return shape;
        }
    }
}
