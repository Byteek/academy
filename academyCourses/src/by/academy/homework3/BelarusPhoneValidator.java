package by.academy.homework3;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class BelarusPhoneValidator implements Validator {

	public static boolean validate(String phoneNumber) {
		Pattern p = Pattern.compile("(\\+375)(29|33|25|44)(\\d{7})");
		Matcher m = p.matcher(phoneNumber);
		return m.find();

	}

	

}
