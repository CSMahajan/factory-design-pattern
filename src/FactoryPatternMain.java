import FactoryPattern.Factory.ShapeFactory;
import FactoryPattern.Shape;

public class FactoryPatternMain {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();
        Shape circleShape = shapeFactory.getShapeInstance("Circle");
        circleShape.draw();
        Shape squareShape = shapeFactory.getShapeInstance("Square");
        squareShape.draw();
        Shape rectangleShape = shapeFactory.getShapeInstance("Rectangle");
        rectangleShape.draw();
    }
}