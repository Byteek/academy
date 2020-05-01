package by.academy.homework3;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) throws ParseException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите день, месяц и год");
		Date date = null;
		Calendar dateCal = Calendar.getInstance();
		String newStr = scan.nextLine();
		boolean result = newStr.matches("([012][1-9]|[3][01])([-/])([0][1-9]|[1][012])([-/)])([0-9]{4})");

		if (newStr.charAt(2) == '/' && newStr.charAt(5) == '/') {
			SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			date = format.parse(newStr);

		} else if (newStr.charAt(2) == '-' && newStr.charAt(5) == '-') {
			SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
			date = format.parse(newStr);
		} else {
			System.out.println("Вы ввели неверные числа!");
			return;
		}
		scan.close();
		dateCal.setTime(date);
		System.out.println("День: \t" + dateCal.get(Calendar.DAY_OF_MONTH) + "\r\n" + "Месяц: \t"
				+ (dateCal.get(Calendar.MONTH) + 1) + "\r\n" + "Год: \t" + dateCal.get(Calendar.YEAR));

//задание 4

		dateCal.add(Calendar.MONTH, 3);
		dateCal.add(Calendar.DAY_OF_MONTH, 2);
		dateCal.add(Calendar.HOUR, 4);
		System.out.println("------------------------------------------------------------");
		System.out.println("День: \t" + dateCal.get(Calendar.DAY_OF_MONTH) + "\r\n" + "Месяц: \t"
				+ (dateCal.get(Calendar.MONTH) + 1) + "\r\n" + "Год: \t" + dateCal.get(Calendar.YEAR));
	}
}
