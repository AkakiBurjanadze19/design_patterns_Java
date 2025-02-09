package Prototype.shapes;

public class Circle extends Shape {
    public int radius;

    /* Default constructor that does nothing */
    public Circle() {}

    /* super(target) calls the Shape copy constructor */
    public Circle(Circle target) {
        super(target);
        if (target != null) {
            this.radius = target.radius;
        }
    }

    @Override
    /* Uses the copy constructor to create a new circle object */
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Circle)) return false;
        Circle shape2 = (Circle) object2;
        return shape2.radius == this.radius;
    }
}
