package prob5;

import java.util.Arrays;
import java.util.List;

public class MethodReferenceForEach {
    @SuppressWarnings("unused")
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon",
                "Away", "On Vacation", "Everywhere you want to be");

        //print each element of the list in upper case format using method reference
        list.forEach(MethodReferenceForEach::printUpperCase);
    }

    public static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
}
