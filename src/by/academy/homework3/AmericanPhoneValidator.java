package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AmericanPhoneValidator implements Validator {

	
	public static boolean validate(String phoneNumber) {
		Pattern p = Pattern.compile("(\\+1)(\\d{10})");
		Matcher m = p.matcher(phoneNumber);
		return m.find();
	}
}
