package channelServiceSubscription;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    String name;
    String id;
    List<Service> services;

    public Customer(String name, String id) {
        this.name = name;
        this.id = id;
        this.services = new ArrayList<>();
    }

    public void addService(Service service) {
        this.services.add(service);
    }

    public void removeService(Service service) {
        this.services.remove(service);
    }

    public int totalFee() {
        int total = 0;
        for (Service service : services) {
            total+=service.calcFee();
        }
        return total;
    }
}
