package code.prob2;

public class Apartment {
    private double rent;

    public Apartment(double rent) {
        this.rent = rent;
    }

    public double getRent() {
        return rent;
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "rent=" + rent +
                '}';
    }
}
