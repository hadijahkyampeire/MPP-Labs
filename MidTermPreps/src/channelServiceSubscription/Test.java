package channelServiceSubscription;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Test {
    public static void main(String[] args) {
       Customer c1 = new Customer("Bob", "1");
       Customer c2 = new Customer("Mary", "2");

       Service daily = new Daily(12, LocalDate.of(2025, 1, 1));
       Service monthly = new Monthly(100);

       c1.addService(daily);
       c1.addService(monthly);

       c2.addService(monthly);

        System.out.println(c1.totalFee() + " total fee");
        System.out.println(c2.totalFee() + " total fee");

    }
}
