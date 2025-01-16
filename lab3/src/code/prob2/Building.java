package code.prob2;

import java.util.ArrayList;
import java.util.List;

public class Building {
    private double maintenanceCost;
    private List<Apartment> apartments = new ArrayList<>();

    public Building(double maintenanceCost, double initialApartmentRent) {
        this.maintenanceCost = maintenanceCost;
        apartments.add(new Apartment(initialApartmentRent));
    }

    public void addApartment(Apartment apartment) {
        apartments.add(apartment);
    }

    @Override
    public String toString() {
        return "Building{" +
                "maintenanceCost=" + maintenanceCost +
                ", apartments=" + apartments +
                ", Total profit rent=" + getProfit() +
                '}';
    }

    public double getProfit(){
        double profit = 0;
        double rentSum = 0;
        for(Apartment a : apartments){
            rentSum += a.getRent();
        }
        profit = rentSum - maintenanceCost;
        return profit;
    }
}
