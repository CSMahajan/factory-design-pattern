package FactoryPattern.Factory;

import FactoryPattern.Circle;
import FactoryPattern.Rectangle;
import FactoryPattern.Shape;
import FactoryPattern.Square;

public class ShapeFactory {

    public Shape getShapeInstance(String shapeName) {
        switch (shapeName) {
            case "Circle":
                return new Circle();
            case "Rectangle":
                return new Rectangle();
            case "Square":
                return new Square();
        }
        return null;
    }
}
