package Streams;

import java.util.List;
import java.util.stream.Collectors;

public class NamesList {
    public static void main(String[] args) {
        List<String> names = List.of("Adam", "Ibrahim", "Julliane", "Mike", "Moe", "John", "Mark");
        char target = 'M';


        System.out.println(namesStartWith(names, target)); // Output: [Mark, Mike, Moe]
    }

    public static List<String> namesStartWith(List<String> names, char target) {
        return names.stream().filter(n -> n.toUpperCase().charAt(0) == target).sorted().toList();
    }
}
