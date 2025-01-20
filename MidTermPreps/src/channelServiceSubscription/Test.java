package channelServiceSubscription;

import java.time.LocalDate;

public class Test {
    public static void main(String[] args) {
        Customer customer = new Customer("John Doe", 123);

        // Create a Monthly service and a Daily service
        Monthly monthlyService = new Monthly();
        monthlyService.setDailyPrice(10);
        monthlyService.setDateSubscribed(LocalDate.of(2023, 12, 1)); // Example start date

        Daily dailyService = new Daily();
        dailyService.setDailyPrice(5);
        dailyService.setDateSubscribed(LocalDate.of(2023, 12, 10)); // Example start date

        // Add services to the customer
        customer.addService(monthlyService);
        customer.addService(dailyService);

        // Calculate the total fee
        System.out.println("Total Fee: " + customer.totalFee());

        // Remove a service
        customer.removeService(monthlyService);

        // Calculate the total fee after removing a service
        System.out.println("Total Fee after removing a service: " + customer.totalFee());

    }
}
