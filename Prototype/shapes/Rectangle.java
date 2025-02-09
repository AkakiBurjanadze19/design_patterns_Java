package Prototype.shapes;

public class Rectangle extends Shape {
    public int width;
    public int height;

    /* Default constructor that does nothing */
    public Rectangle() {}

    /* super(target) calls the Shape copy constructor */
    public Rectangle(Rectangle target) {
        super(target);
        if (target != null) {
            this.width = target.width;
            this.height = target.height;
        }
    }

    @Override
    /* Uses the copy constructor to create a new Rectangle object */
    public Shape clone() {
        return new Rectangle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Rectangle)) return false;
        Rectangle shape2 = (Rectangle) object2;
        return shape2.width == this.width && shape2.height == this.height;
    }
}
