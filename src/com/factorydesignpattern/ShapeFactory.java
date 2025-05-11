package com.factorydesignpattern;

public class ShapeFactory {

    public static Shape getShape(String shapeType){
        if(shapeType == null)
            return null;
        else if(shapeType.equals("Circle"))
            return new Circle();
        else if(shapeType.equals("Square"))
            return new Square();
        return null;
    }
}
