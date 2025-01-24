package prob3;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.TreeSet;
import java.util.function.Consumer;



public class ForEachExample {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Hello there", "Goodbye", "Back soon", 
				"Away", "On Vacation", "Everywhere you want to be");
		
		//print each element of the list in upper case format
		list.forEach(consumer);

		// lambda
		list.forEach(consumer2);
		
	}
	
	//implement a Consumer
    static Consumer<String> consumer = new Consumer<String>() {

		@Override
		public void accept(String s) {
			System.out.println(s.toUpperCase());
		}
	};

	// Use Lambda
	static Consumer<String> consumer2 = s -> System.out.println(s.toUpperCase());
}