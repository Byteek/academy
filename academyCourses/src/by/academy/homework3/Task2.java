package by.academy.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите день, месяц и год" + "\r");
		Date date = null;
		Calendar dateCal = Calendar.getInstance();
		String newStr = scan.nextLine();
//		boolean result = newStr.matches("([012][1-9]|[3][01])([-/])([0][1-9]|[1][012])([-/)])([0-9]{4})");// ну можно и так 
		boolean result = newStr.matches("(\\d{1,2}([-/])\\d{1,2}([-/])\\d{4})");

		if (result) {
			if (newStr.charAt(2) == '-' && newStr.charAt(5) == '-') {
				SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
				date = format.parse(newStr);
			} else if (newStr.charAt(2) == '/' && newStr.charAt(5) == '/') {
				SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
				date = format.parse(newStr);
			}
		} else {
			System.out.println("Вы ввели неверную информацию");
			return;
		}
		dateCal.setTime(date);
		System.out.println("День: \t" + dateCal.get(Calendar.DAY_OF_MONTH) + "\r\n" + "Месяц: \t"
				+ (dateCal.get(Calendar.MONTH) + 1) + "\r\n" + "Год: \t" + dateCal.get(Calendar.YEAR));

	}
}