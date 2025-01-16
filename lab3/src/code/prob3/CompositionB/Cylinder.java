package code.prob3.CompositionB;

public class Cylinder {
    private double height;
    private Circle circle;

    public Cylinder(double height, double radius) {
        this.height = height;
        this.circle = new Circle(radius);
    }

    public double getHeight() {
        return height;
    }

    public double computeVolume() {
        return circle.computeArea() * height;
    }
}
