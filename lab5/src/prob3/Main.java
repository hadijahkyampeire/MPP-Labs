package prob3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(12.5);
        Rectangle rectangle = new Rectangle(12.5, 12.5);
        Triangle triangle = new Triangle(12.5, 12.5);

        Shape[] shapes = {circle, rectangle, triangle};
        double sum = 0.0;

        for (Shape shape : shapes) {
            sum += shape.computeArea();
        }
        System.out.printf("\"Sum of areas: %.2f", sum);
    }
}
