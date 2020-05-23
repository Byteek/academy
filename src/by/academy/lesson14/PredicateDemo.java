package by.academy.lesson14;

import java.util.function.Predicate;

public class PredicateDemo {

	public static void main(String[] args) {
		String nStr = null;
		Predicate<String> noNull = s -> s != null;
		Predicate<String> noVolum = s -> !s.equals("");

		System.out.println(noNull.test("dadad"));
		System.out.println(noNull.test(nStr));
		System.out.println(noVolum.test("dadad"));
		System.out.println(noVolum.test(""));
		System.out.println(noNull.and(noVolum).test(nStr));
		System.out.println(noNull.and(noVolum).test(""));
		System.out.println(noNull.and(noVolum).test("1231412"));
		
		
		
	}

}
