package channelServiceSubscription;

import java.util.Vector;

public class Customer {
    String name;
    int id;
    Vector<Service> services;

    public Customer(String name, int id) {
        this.name = name;
        this.id = id;
        this.services = new Vector<>();
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
