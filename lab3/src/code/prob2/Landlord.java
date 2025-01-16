package code.prob2;

import java.util.ArrayList;
import java.util.List;

public class Landlord {
    private List<Building> buildings;

    public Landlord() {
        this.buildings = new ArrayList<>();
    }
    public void addBuilding(Building building) {
        buildings.add(building);
    }

    public double calcProfits() {
        double totalProfits = 0;
        for (Building building : buildings) {
            totalProfits += building.getProfit();
        }
        return totalProfits;
    }
}
