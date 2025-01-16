package code.prob2;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		Apartment[] apts0 = {
				new Apartment(600),
				new Apartment(700)
		};

		Apartment[] apts1 = {
				new Apartment(500),
				new Apartment(450)
		};

		Apartment[] apts2 = {
				new Apartment(1100),
				new Apartment(650)
		};

		Apartment[] apts3 = {
				new Apartment(6750),
				new Apartment(945)
		};

		Building[] bldgs = {
				new Building(150, 400),
				new Building(175, 900),
				new Building(150, 300),
				new Building(175, 775)
		};

		System.out.println(Arrays.toString(bldgs)+ "Buildings");
		for(Apartment a : apts0) {
			bldgs[0].addApartment(a);
		}
		for(Apartment a : apts1) {
			bldgs[1].addApartment(a);
		}
		for(Apartment a : apts2) {
			bldgs[2].addApartment(a);
		}
		for(Apartment a : apts3) {
			bldgs[3].addApartment(a);
		}

		Landlord landlord = new Landlord();
		for(Building b: bldgs) {
			landlord.addBuilding(b);
		}
		System.out.println("Total Profits" + landlord.calcProfits());

	}
}


