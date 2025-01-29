package part2.prob10;

import java.util.*;

public class Or {

	public static void main(String[] args) {
		List<Simple> list = Arrays.asList(new Simple(false), new Simple(false), new Simple(true));
		System.out.println(someSimpleIsTrue2(list));

	}

	// IMPERATIVE CODE
//	public static boolean someSimpleIsTrue(List<Simple> list) {
//		boolean accum = false;
//		for(Simple s: list) {
//			accum = accum || s.flag;
//		}
//		return accum;
//	}

	// RE-WRITTEN USING REDUCE
	public static boolean someSimpleIsTrue2(List<Simple> list) {
        return list.stream()
                .map(s -> s.flag)
                .reduce(false, (a, b) -> a || b);

	}

}
