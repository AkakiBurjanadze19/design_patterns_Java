package Prototype.shapes;

import java.util.Objects;

/* Common shape interface */
public abstract class Shape {
    public int x;
    public int y;
    public String color;

    /* Default constructor that does nothing */
    public Shape() {}

    /* Copy constructor */
    public Shape(Shape target) {
        this.x = target.x;
        this.y = target.y;
        this.color = target.color;
    }

    /* This method must be implemented by subclasses */
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == this.x && shape2.y == this.y && Objects.equals(shape2.color, this.color);
    }
}
