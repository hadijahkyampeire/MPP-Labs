package Streams.landlordBuilding;

import java.util.List;

public class Building {
    List<Apartment> apartments;

    public Building(List<Apartment> apartments) {
        this.apartments = apartments;
    }

    public List<Apartment> getApartments() {
        return apartments;
    }
}
