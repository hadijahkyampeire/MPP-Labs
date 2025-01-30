package part2.prob10;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StringStream {
    public static void main(String[] args) {
        Stream<String> stringStream = Stream.of("Bill", "Thomas", "Mary");
        // Joins all strings in a stream separated by comma
        String joinedStrings = stringStream.collect(Collectors.joining(", "));
        System.out.println(joinedStrings);
    }
}
