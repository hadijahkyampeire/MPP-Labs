package prob2;

public class EquilateralTriangle implements Polygon {
    private double length;
    public EquilateralTriangle(double length) {
        this.length = length;
    }

    @Override
    public double[] getSides() {
        return new double[]{ length, length, length};
    }
}
