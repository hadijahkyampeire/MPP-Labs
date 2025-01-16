package code.prob4;

public class Driver {
    	public static void main(String[] args) {

		Object[] objects = { new House(9000), new Condominium(2), new Trailer() };
		double totalRent = Admin.computeTotalRent(objects);
		System.out.println("No Polymorphism " + totalRent); // 2200

		// Refactor using polymorphism
		Property house = new House(9000);
		Property condominium = new Condominium(2);
		Property trailer = new Trailer();

		Property[] objects2 = { house, condominium, trailer };
		double totalRent2 = Admin.computeTotalRentWithInheritance(objects2);
		System.out.println();
		System.out.println("Using POLYMORPHISM " + totalRent2); // 2200
	}
}
