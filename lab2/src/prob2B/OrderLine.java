package prob2B;

public class OrderLine {
    private Order order;
    private int lineNum;
    private double price;

    public Order getOrder() {
        return order;
    }

    public int getLineNum() {
        return lineNum;
    }

    public double getPrice() {
        return price;
    }

    OrderLine(int lineNum, double price, Order order) {
        this.lineNum = lineNum;
        this.price = price;
        this.order = order;
    }

    @Override
    public String toString() {
        return "OrderLine{" +
                "order=" + order +
                ", lineNum=" + lineNum +
                ", price=" + price +
                '}';
    }
}
