package Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmployeeLambdaLibrary {
    public static final Function<List<Employee>, Double> netSalary = list -> list.stream()
            .map(e -> e.getSalary()).map(s -> s * 0.88)
            .reduce(0.0, (x, y) -> x + y);

    public static void main(String[] args) {
        List<Employee> emps = new ArrayList<>();
        emps.add(new Employee("Zaineh", 7000));
        emps.add(new Employee("Yasmeen", 6000));
        emps.add(new Employee("Dean", 3000));

        System.out.println(netSalary.apply(emps));
    }



}
