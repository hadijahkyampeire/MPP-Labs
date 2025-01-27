package prob5;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SecondSmallest {
    public static <T extends Comparable<T>> T secondSmallest(List<T> elements) {
        Collections.sort(elements);
        return elements.get(1);
    }

    public static void main(String[] args) {
        List<Integer> ints = Arrays.asList(1, 45, 3, 4, 65, 6, 7, 68, 3, 10);
        System.out.println(secondSmallest(ints));

        List<String> strings = Arrays.asList("a", "z", "c", "v", "e", "h", "g", "j");
        System.out.println(secondSmallest(strings));

    }
}
