package part2.prob11;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class LambdaLibrary {

    // Inner class to handle filters
    static class EmployeeFilterCriteria {
        private int salaryThreshold;
        private char lastNameStart;
        private char lastNameEnd;

        public EmployeeFilterCriteria(int salaryThreshold, char lastNameStart, char lastNameEnd) {
            this.salaryThreshold = salaryThreshold;
            this.lastNameStart = lastNameStart;
            this.lastNameEnd = lastNameEnd;
        }
        public int getSalaryThreshold() {
            return salaryThreshold;
        }
        public char getLastNameStart() {
            return lastNameStart;
        }
        public char getLastNameEnd() {
            return lastNameEnd;
        }
    }

    // Lambda Library Function
    public static final BiFunction<List<Employee>, EmployeeFilterCriteria, String> SORTED_FULL_NAMES
            =  (list, employeeFilter) -> list.stream()
            .filter(e -> {
                char firstLastNameChar = e.getLastName().toUpperCase().charAt(0);
                boolean isNameMatch = firstLastNameChar >= employeeFilter.getLastNameStart()
                        && firstLastNameChar <= employeeFilter.getLastNameEnd();
                return isNameMatch && e.getSalary() > employeeFilter.getSalaryThreshold();})
            .map(e -> e.getFirstName() + " " + e.getLastName())
            .sorted()
            .collect(Collectors.joining(", "));



    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee("Joe", "Davis", 120000),
                new Employee("John", "Sims", 110000),
                new Employee("Joe", "Stevens", 200000),
                new Employee("Andrew", "Reardon", 80000),
                new Employee("Joe", "Cummings", 760000),
                new Employee("Steven", "Walters", 135000),
                new Employee("Thomas", "Blake", 111000),
                new Employee("Alice", "Richards", 101000),
                new Employee("Donald", "Trump", 100000));

        EmployeeFilterCriteria filters = new EmployeeFilterCriteria(100000, 'N', 'Z');
        System.out.println(SORTED_FULL_NAMES.apply(employees, filters));

        EmployeeFilterCriteria filters2 = new EmployeeFilterCriteria(10000, 'A', 'R');
        System.out.println(SORTED_FULL_NAMES.apply(employees, filters2));

    }
}
