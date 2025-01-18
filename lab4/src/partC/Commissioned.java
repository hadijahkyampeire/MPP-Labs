package partC;

import java.util.List;

public class Commissioned extends Employee{
    private double commission;
    private double baseSalary;
    private Order[] orders;

    public Commissioned(String empId, double baseSalary, double commission, Order[] orders) {
        super(empId);
        this.commission = commission;
        this.baseSalary = baseSalary;
        this.orders = orders;
    }

    @Override
    public double calcGrossPay(int month, int yr) {
        double totalOrderAmount = 0.0;

        // calculate total sales for a given month
        for(Order order : orders) {
            if(order.getOrderDate().getMonthValue() == month && order.getOrderDate().getYear() == yr) {
                totalOrderAmount += order.getOrderAmount();
            }
        }
        return baseSalary + (commission * totalOrderAmount);
    }
}
