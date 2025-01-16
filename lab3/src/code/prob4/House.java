package code.prob4;

public class House extends Property{
    private double lotSize;

    public House(double lotSize){
        super();
        this.lotSize = lotSize;
    }

    @Override
    public double computeRent() {
        return 0.1 * this.lotSize;
    }
}
