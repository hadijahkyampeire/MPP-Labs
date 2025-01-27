package prob1;

import java.util.ArrayList;
import java.util.List;

public class TestErrors {
    public static void main(String[] args) {
        List<Integer> ints = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        // List<Number> nums = ints; // Requires List<Number> but we are giving it List<Integer>
        // nums.add(3.14);

        // Using wild card
        List<Integer> ints2 = new ArrayList<>();
        ints.add(1);
        ints.add(2);
        List<? extends Number> nums2 = ints;
        // nums2.add(3.14); // Cannot add

        System.out.println(nums2);
    }
}
