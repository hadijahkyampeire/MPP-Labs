package prob1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // PART B
        // method reference: Supplier<Double> mathRandom = Math::random;
        // lambda expression
        Supplier<Double> mathRandomLambda = () -> Math.random();
        System.out.println(mathRandomLambda.get());


        // part A Testing
        String s = "qwerty";
        String t = "Qwerty";
        System.out.println("Ignore case: " + s.compareToIgnoreCase(t));
        System.out.println("Normal Compare: " + s.compareTo(t));
    }
}
