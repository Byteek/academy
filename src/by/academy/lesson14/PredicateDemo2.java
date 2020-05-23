package by.academy.lesson14;

import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PredicateDemo2 {

	public static void main(String[] args) {
		String x = "Yonny";
		String y = "JOOOONNNAAAA";
		Predicate<String> jOrN = s -> {
			Pattern p = Pattern.compile("^[J | N].*[A]$");
			Matcher m = p.matcher(s);
			return m.find();
		};

		System.out.println(jOrN.test(x));
		System.out.println(jOrN.test(y));

	}
}