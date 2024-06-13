package src.src.shape;

public abstract class Shape {
    protected double x;
    protected double y;

    public Shape(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public abstract double getArea();
    public abstract double getPerimeter();

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
