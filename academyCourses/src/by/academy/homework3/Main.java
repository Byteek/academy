package by.academy.homework3;

public class Main {

	public static void main(String[] args) {
		AmericanPhoneValidator valid = new AmericanPhoneValidator();
		BelarusPhoneValidator belValid = new BelarusPhoneValidator();
		EmailValidator email = new EmailValidator();
		System.out.println(valid.validate("+23564569988"));
		System.out.println(valid.validate("+11252564444"));
		System.out.println(valid.validate("+12562569988"));
		System.out.println(valid.validate("+21561569988"));
		System.out.println("--------------------------------");
		System.out.println(belValid.validate("+375333518629"));
		System.out.println(belValid.validate("+37533358629"));
		System.out.println(belValid.validate("+375253518629"));
		System.out.println(belValid.validate("+37512546549"));
		System.out.println("--------------------------------");
		System.out.println(email.validate("byteek.p.n@gmail.com"));
		System.out.println(email.validate("+37533358629"));
		System.out.println(email.validate("+375253518629"));
		System.out.println(email.validate("+37512546549"));

	}

}
