package prob2B;

public class Main {
    public static void main(String[] args) {

        Order order1 = new Order("1234", 1, 12.0);
        order1.addOrderLine(1, 4.5);

        OrderLine orderLine = new OrderLine(2, 15.0, order1);
        System.out.println(orderLine);

    }
}
