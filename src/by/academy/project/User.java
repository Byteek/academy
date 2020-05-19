package by.academy.project;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import by.academy.homework3.Validator;

public class User {
	private String name;
	private double money;
	private Date dateOfBirth;
	private String phone;
	private String email;

	public User() {

	}

	public User(String name, double money) {
		this.name = name;
		this.money = money;
	}

	public User(String name, double money, Date dateOfBirth, String phone, String email) {
		super();
		this.name = name;
		this.money = money;
		this.dateOfBirth = dateOfBirth;
		this.phone = phone;
		this.email = email;
	}

	public static User getSeller() {
		String name;
		double money;
//		Date dateOfBirth;
//		String phone;
//		String email;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите имя");
		name = scanner.nextLine();
		System.out.println("Введите сумму которая имеется у вас на счету");
		money = Double.parseDouble(scanner.nextLine());

		return new User(name, money);
	}

	public static User getBuyer() {
		String name;
		double money;
		Date dateOfBirth;
		String phone;
		String email;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите имя");
		name = scanner.nextLine();
		System.out.println("Введите сумму которая имеется у вас на счету");
		money = Double.parseDouble(scanner.nextLine());

		return new User(name, money);
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirthUser) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите день, месяц и год" + "\r");
		String newStr = scan.nextLine();
		boolean result = newStr.matches("(\\d{1,2}([-/])\\d{1,2}([-/])\\d{4})");
		boolean test = true;
		while (test) {
			if (result) {
				if (newStr.charAt(2) == '-' && newStr.charAt(5) == '-') {
					SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
					this.dateOfBirth = format.parse(newStr);
					test = false;
				} else if (newStr.charAt(2) == '/' && newStr.charAt(5) == '/') {
					SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
					this.dateOfBirth = format.parse(newStr);
					test = false;
				}
			} else {
				System.out.println("Вы ввели неверную информацию");
				return;
			}
		}
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		if (validatePhone(phone)) {
			this.phone = phone;
		}
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		Validator emailValidator = new Validator() {
			public boolean validate(String emailAddress) {
				Pattern p = Pattern
						.compile("^[\\w\\d-\\+]+(\\.[\\w\\d-]+)*@[\\w\\d-]+(\\.[\\w\\d]+)*(\\.[A-Za-z]{2,})$");
				Matcher m = p.matcher(emailAddress);
				return m.find();
			}
		};
		if (emailValidator.validate(email)) {
			this.email = email;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public static boolean validatePhone(String phoneNumber) {
		Pattern p = Pattern.compile("(\\+375)(29|33|25|44)(\\d{7})");
		Matcher m = p.matcher(phoneNumber);
		return m.find();
	}

//	public static boolean validateEmail(String emailAddress) {
//		Pattern p = Pattern.compile("^[\\w\\d-\\+]+(\\.[\\w\\d-]+)*@[\\w\\d-]+(\\.[\\w\\d]+)*(\\.[A-Za-z]{2,})$");
//		Matcher m = p.matcher(emailAddress);
//		return m.find();
//	}

}
