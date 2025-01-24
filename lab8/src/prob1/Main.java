package prob1;

import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        // PART B
        // method reference: Supplier<Double> mathRandom = Math::random;
        // lambda expression
        Supplier<Double> mathRandom = () -> Math.random();
        System.out.println(mathRandom.get());


        // part A
        String s = "qwerty";
        String t = "qwerty";
        s.compareToIgnoreCase(t);
        s.compareTo(t);



    }
}
