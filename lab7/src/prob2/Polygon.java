package prob2;

public interface Polygon extends ClosedCurve {
    double[] getSides();

    default double computePerimeter() {
        double[] sides = getSides();
        double perimeter = 0;
        for(double x : sides) {
            perimeter += x;
        }
        return perimeter;
    }
}
