package Streams;

import java.util.Arrays;

public class SumTwoNumbers {
    public static void main(String[] args) {
        int[] numbers = {15, 45, 25, 50, 20, 35, 60, 10};
        System.out.println(sumTwoNumbers(numbers));
    }

    public static int sumTwoNumbers(int[] nums) {
        return Arrays.stream(nums)
                .filter(n -> n >= 30)
                .limit(2)
                .sum();
    }
}
