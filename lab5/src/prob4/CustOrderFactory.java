package prob4;

import java.time.LocalDate;

public class CustOrderFactory {
    public static Customer createCustomer(String name) {
        return new Customer(name);
    }

    public static Item createItem(String name) {
        return new Item(name);
    }

    public static Order newOrder(Customer cust, LocalDate date) {
        if(cust == null) throw new NullPointerException("Null customer");
        Order ord = new Order(date);
        cust.addOrder(ord);
        return ord;
    }
}
