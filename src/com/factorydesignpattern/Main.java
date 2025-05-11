package com.factorydesignpattern;

public class Main {
    public static void main(String[] args) {

        Shape shape = ShapeFactory.getShape("Circle");
        shape.draw();

        Shape shape1 = ShapeFactory.getShape("Square");
        shape1.draw();
    }
}
