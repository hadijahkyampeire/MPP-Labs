package prob3;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

public class Main {
    public static void main(String[] args) {
        // Lamba
        BiFunction<Double, Double, List<Double>> f = (x,y) -> {
            List<Double> list = new ArrayList<>();
            list.add(Math.pow(x,y));
            list.add(x * y);
            return list;
        };

        System.out.println(f.apply(2.0, 3.0));
    }
}
