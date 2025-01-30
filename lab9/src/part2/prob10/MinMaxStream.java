package part2.prob10;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxStream {
    public static void main(String[] args) {
        Stream<Integer> s = Stream.of(11, 42, 30, 4, 50, 6, 74, 89, 99, 10);
        IntSummaryStatistics stats = s.collect(Collectors.summarizingInt(n -> n));
        System.out.println("MAX: "+ stats.getMax());
        System.out.println("MIN: "+ stats.getMin());
    }
}
