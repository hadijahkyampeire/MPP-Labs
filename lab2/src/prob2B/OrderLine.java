package prob2B;

public class OrderLine {
    private Order order;

    public Order getOrder() {
        return order;
    }

    OrderLine(Order order) {
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "order=" + order +
                '}';
    }
}
