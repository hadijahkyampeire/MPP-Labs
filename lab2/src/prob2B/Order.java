package prob2B;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String orderNumber;
    private List<OrderLine> orderLines;

    public String getOrderNumber() {
        return orderNumber;
    }

    public List<OrderLine> getOrderLines() {
        return orderLines;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNumber='" + orderNumber + '\'' +
                '}';
    }

    public Order(String orderNumber, int lineNumber, double price) {
        this.orderNumber = orderNumber;
        this.orderLines = new ArrayList<>();
        addOrderLine(lineNumber, price);
    }

    public void addOrderLine(int lineNumber, double price) {
        orderLines.add(new OrderLine(lineNumber, price, this));
    }
}
