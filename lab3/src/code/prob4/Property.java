package code.prob4;

abstract public class Property {
    private double rent;
    private Address address;

    public double getRent() {
        return rent;
    }

    public Address getAddress() {
        return address;
    }

    abstract public double computeRent();
}
