package Prototype;

import Prototype.shapes.Circle;
import Prototype.shapes.Rectangle;
import Prototype.shapes.Shape;

import java.util.ArrayList;
import java.util.List;

public class Demo {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 50;
        circle.color = "blue";
        shapes.add(circle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 200;
        rectangle.height = 100;
        rectangle.color = "red";
        shapes.add(circle);

        cloneAndCompare(shapes, shapesCopy);
    }

    public static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println("Shapes are different objects!");
                if (shapes.get(i) == shapesCopy.get(i)) {
                    System.out.println("And they are identical!");
                } else {
                    System.out.println("But they are not identical!");
                }
            } else {
                System.out.println("Shape objects are the same!");
            }
        }
    }
}
