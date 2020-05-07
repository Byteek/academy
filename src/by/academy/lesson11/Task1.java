package by.academy.lesson11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Создать статический метод который принимает на вход три параметра: 
//	login, password и confirmPassword. Login должен содержать только латинские буквы, 
//	цифры и знак подчеркивания. Длина login должна быть меньше 20 символов. 
//	Если login не соответствует этим требованиям, необходимо выбросить WrongLoginException. 
//	Password должен содержать только латинские буквы, цифры и знак подчеркивания. 
//	Длина password должна быть меньше 20 символов. 
//	Также password и confirmPassword должны быть равны. 
//	Если password не соответствует этим требованиям, 
//	необходимо выбросить WrongPasswordException.  
//	WrongPasswordException и WrongLoginException - пользовательские классы 
//	исключения с двумя конструкторами – один по умолчанию, 
//	второй принимает сообщение исключения и передает его в конструктор класса Exception. 
//	Обработка исключений проводится внутри метода. 
//	Используем multi-catch block. Метод возвращает true, 
//	если значения верны или false в другом случае.

public class Task1 {

	public static boolean SignIn(String login, String password, String confirmPassword) {
		Pattern pLogin = Pattern.compile("[A-Za-z0-9_]{2,20}");
		Matcher mLogin = pLogin.matcher(login);
		Pattern pPassword = Pattern.compile("[A-Za-z1-9_]{8,20}");
		Matcher mPassword = pPassword.matcher(password);

		// login

		try {
			if (mLogin.find()) {
			} else {
				throw new WrongLoginException();
			}
		} catch (WrongLoginException e) {
			System.out.println("eror");
			return false;
		}

		// pass

		if (password.equals(confirmPassword)) {

			try {
				if (mPassword.find()) {
				} else {
					throw new WrongPasswordException();
				}
			} catch (WrongPasswordException e) {
				System.out.println("eror");
				return false;
			}

		} else {
			return false;
		}

		return true;

	}

	public static void main(String[] args) {

		System.out.println(Task1.SignIn("Login123_", "123qwe_QWE", "123qwe_QWE"));
		System.out.println(Task1.SignIn("Login123_", "123qwe_QWE", "123qwe_QWEe"));
		System.out.println(Task1.SignIn("Login123", "123qwe_QWE", "123qwe_QWEe"));
		System.out.println(Task1.SignIn("Login123_", "123qweQWE", "123qweQWEe"));

	}

}
