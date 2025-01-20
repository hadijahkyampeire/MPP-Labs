package code.prob4;

public class Admin {

	// Non OO implementation
    	public static double computeTotalRent(Object[] properties) {
		double totalRent = 0;

		// Functionality without inheritance
		for (Object o : properties) {
			if (o instanceof House) {
				House h = (House) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Condominium) {
				Condominium h = (Condominium) o;
				totalRent += h.computeRent();
			}
			else if (o instanceof Trailer) {
				Trailer h = (Trailer) o;
				totalRent += h.computeRent();
			}
		}

		return totalRent;
	}

	public static double computeTotalRentWithInheritance(Property[] properties) {
		double totalRent = 0;

		for (Property p : properties) {
			totalRent += p.computeRent();
		}

		return totalRent;
	}
}
