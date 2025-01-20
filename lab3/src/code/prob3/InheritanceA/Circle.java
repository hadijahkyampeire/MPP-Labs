package code.prob3.InheritanceA;

public class Circle extends Cylinder {

    public Circle(double radius) {
        super(radius);
    }

    public double computeArea() {
        return Math.PI * getRadius() * getRadius();
    }
}
