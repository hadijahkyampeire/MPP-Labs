package Streams.landlordBuilding;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Apartment> apts1 = Arrays.asList(new Apartment(100), new Apartment(200), new Apartment(300));
        List<Apartment> apts2 = Arrays.asList(new Apartment(500), new Apartment(300), new Apartment(100));
        List<Apartment> apts3 = Arrays.asList(new Apartment(400), new Apartment(100), new Apartment(500));

        List<Building> buildings1 = Arrays.asList(new Building(apts1), new Building(apts2));
        List<Building> buildings2 = Arrays.asList(new Building(apts3));

        Owner owner1 = new Owner(buildings1);
        Owner owner2 = new Owner(buildings2);
        List<Owner> ownersList = new ArrayList<>();
        ownersList.add(owner1);
        ownersList.add(owner2);

        System.out.println(allOwnerTotalApartmentRent(ownersList));
    }

    public static double allOwnerTotalApartmentRent(List<Owner> owners) {
        return owners.stream()
                .flatMap(owner -> owner.buildings.stream())
                .flatMap(b -> b.apartments.stream())
                .mapToDouble(a -> a.getRent()).sum();
    }
}
