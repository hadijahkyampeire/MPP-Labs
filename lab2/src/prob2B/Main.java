package prob2B;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order("1234");
        Order order2 = new Order("5678");

        OrderLine line1 = new OrderLine(order1);
        OrderLine line2 = new OrderLine(order2);


    }
}
