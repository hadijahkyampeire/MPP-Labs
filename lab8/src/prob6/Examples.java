package prob6;

import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.ToIntBiFunction;

public class Examples {
    //type: Class::instanceMethod
    Function<String, String> upper1 = (String x) -> x.toUpperCase();
    Function<String, String> upper2 = String::toUpperCase;

    // A. (Employee e) -> e.getName() --> Accepts one argument and produces a result
    Function<Employee, String> employeeName = (Employee e) -> e.getName();
    Function<Employee, String> employeeName2 = Employee::getName;

    // B: (Employee e,String s) -> e.setName(s) --> Accepts two arguments and produces no results
    BiConsumer<Employee, String> setEmployeeName = (Employee e, String s) -> e.setName(s);
    BiConsumer<Employee, String> setEmployeeName2 = Employee::setName;

    // C. (String s1,String s2) -> s1.compareTo(s2) --> Accepts two arguments and returns int
    BiFunction<String, String, Integer> compareLambda = (String s1, String s2) -> s1.compareTo(s2);
    BiFunction<String, String, Integer> compareMethodReference = String::compareTo;

    // D. (Integer x,Integer y) -> Math.pow(x,y) --> Accepts two arguments and returns a result
    BiFunction<Integer, Integer, Double> powerOfLambda = (Integer x, Integer y) -> Math.pow(x, y);
    BiFunction<Integer, Integer, Double> powerOfMethodReference = Math::pow;

    // E. (Apple a) -> a.getWeight() --> Accepts one argument and returns a result
    Function<Apple, Double> appleWeightLambda = (Apple a) -> a.getWeight();
    Function<Apple, Double> appleWeightMethodReference = Apple::getWeight;

    // F. (String x) -> Integer.parseInt(x); --> Accepts one argument and returns int-based value
    Function<String, Integer> parseIntLambda = (String x) -> Integer.parseInt(x);
    Function<String, Integer> parseIntMethodReference = Integer::parseInt;

    // G. EmployeeNameComparator comp = new EmployeeNameComparator(); (Employee e1, Employee e2) -> comp.compare(e1,e2)
    EmployeeNameComparator comp = new EmployeeNameComparator();
    BiFunction<Employee, Employee, Integer> employeeComparatorLambda = (Employee e1, Employee e2) -> comp.compare(e1, e2);
    BiFunction<Employee, Employee, Integer> employeeComparatorMethodRef = comp::compare;

    public void evaluator() {
        System.out.println(upper2.apply("hello"));

        // Other evaluators
        Employee e1 = new Employee("John Doe");
        System.out.println("Employee Name: " + employeeName2.apply(e1));

        setEmployeeName2.accept(e1, "Jane Doe");
        System.out.println("Employee Name after set: " + e1.getName()); // Jane Doe

        System.out.println("String Compare: " + compareMethodReference.apply("Test", "Test")); // 0

        System.out.println("x Power of y: " + powerOfMethodReference.apply(2, 3)); // 8.0

        Apple apple1 = new Apple(0.75);
        System.out.println("Apple weight: " + appleWeightMethodReference.apply(apple1)); // 0.75

        System.out.println("Parse Int: " + parseIntMethodReference.apply("23")); // 23

        Employee e2 = new Employee("John Doe");
        System.out.println("Employee Comparator: " + employeeComparatorMethodRef.apply(e2, e1)); // some int value

        Employee e3 = new Employee("John Doe");
        System.out.println("Employee Comparator2: " + employeeComparatorMethodRef.apply(e3, e2)); // 0

    }

    public static void main(String[] args) {
        Examples e = new Examples();
        e.evaluator();

    }

}
