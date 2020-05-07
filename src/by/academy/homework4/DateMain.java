package by.academy.homework4;

import java.util.Scanner;

import by.academy.homework4.Date.Day;

public class DateMain {
	public static void main(String... args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Good time of day! Please enter a date.");
		Date date1 = new Date("01-05-2020");
		System.out.println(date1.dayOfTheWeek());

		Date date2 = new Date("18-05-2020"); // leapYear -- true
		System.out.println(date2.dayOfTheWeek());

		Date date3 = new Date("04-05-2019"); // leapYear -- false

		System.out.println(date2.leapYear());
		System.out.println(date3.leapYear());

		System.out.println(Date.numberOfDaysBetween(date1, date2));

	}
}
