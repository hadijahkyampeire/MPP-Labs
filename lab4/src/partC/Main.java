package partC;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Hourly Employee
        Employee hourly = new Hourly("E001", 20.0, 40);
        PayCheck hourlyPaycheck = hourly.calcCompensation(1, 2025);
        System.out.println("Hourly Employee:");
        hourlyPaycheck.print();

        // Salaried Employee
        Employee salaried = new Salaried("E002", 3000.0);
        PayCheck salariedPaycheck= salaried.calcCompensation(1, 2025);
        System.out.println("\nSalaried Employee:");
        salariedPaycheck.print();

        // Commissioned Employee
        Order order1 = new Order("O001", LocalDate.of(2025, 1, 5), 500.0);
        Order order2 = new Order("O002", LocalDate.of(2025, 1, 15), 300.0);

        Order[] orders = {order1, order2};
        Employee commissioned = new Commissioned("E003", 1000.0, 0.1, orders);
        PayCheck commissionedPaycheck = commissioned.calcCompensation(1, 2025);
        System.out.println("\nCommissioned Employee:");
        commissionedPaycheck.print();
    }
}
