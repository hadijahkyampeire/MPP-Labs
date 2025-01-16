package code.prob4;

public class Condominium extends Property {
    private int numberOfFloors;

    public Condominium(int noOfFloors) {
        super();
        this.numberOfFloors = noOfFloors;
    }

    @Override
    public double computeRent() {
        return 400 * numberOfFloors;
    }
}
