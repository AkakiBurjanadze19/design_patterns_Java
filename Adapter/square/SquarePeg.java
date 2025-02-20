package Adapter.square;

/* Square pegs are not compatible with round holes */
public class SquarePeg {
    private double width;

    public SquarePeg(double width) {
        this.width = width;
    }

    public double getWidth() {
        return this.width;
    }

    public double getSquare() {
        return Math.pow(this.width, 2);
    }
}
