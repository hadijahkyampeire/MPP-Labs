package code.prob3.InheritanceA;

public class Circle extends Cylinder {
    private double radius;

    public Circle(double radius) {
        super(radius);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public double computeArea() {
        return Math.PI * radius * radius;
    }
}
