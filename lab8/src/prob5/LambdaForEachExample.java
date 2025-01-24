package prob5;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;



public class LambdaForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format using Lambda
		list.forEach(s -> System.out.println(s.toUpperCase()));
		
	}
}