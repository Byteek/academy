package by.academy.homework4;

import java.time.Period;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Date {
	private DayOfTheWeek dayOfYheWeek;
	private Year year;
	private Month month;
	private Day day;
	private int dayOfWeekInt;
	private String dateTest;
	private String dateStr;
	private String dateValid = ("([012][1-9]|[3][01])([-/])([0][1-9]|[1][012])([-/)])([0-9]{4})");

	public Date() {

	}

	public Date(String dateStr) {
		this.dateTest = dateStr;
		System.out.println("you entered - " + dateStr);
		PleaseEnterDate(this.dateTest);
		this.dateStr = dateStr;
	}

	private void PleaseEnterDate(String dateStr) {

		while (true) {
			boolean result = dateStr.matches(dateValid);

			if (result) {
				day = new Day();
				month = new Month();
				year = new Year();
				Pattern pDay = Pattern.compile(dateValid);
				Matcher matcher = pDay.matcher(dateStr);
				while (matcher.find()) {
					day.setStrDay((matcher.group(1)));
					month.setStrMonth(matcher.group(3));
					year.setStrYear(matcher.group(5));
				}
				return;
			} else {
				System.out.println("Please enter a date in the format 01-01-1970");
				continue;
			}

		}

	}

	public String dayOfTheWeek() {
		Calendar c = new GregorianCalendar();
		c.set(year.getIntYear(), month.getIntMonth() - 1, day.getIntDay());
		c.setTime(c.getTime());
		c.toString();
		dayOfWeekInt = c.get(Calendar.DAY_OF_WEEK);
		whatDayOfTheWeek(dayOfWeekInt);
		return dayOfYheWeek.name();

	}

	private void whatDayOfTheWeek(int number) {
		switch (number - 1) {
		case 1:
			dayOfYheWeek = dayOfYheWeek.MONDAY;
			break;
		case 2:
			dayOfYheWeek = dayOfYheWeek.TUESDAY;
			break;
		case 3:
			dayOfYheWeek = dayOfYheWeek.WEDNESDAY;
			break;
		case 4:
			dayOfYheWeek = dayOfYheWeek.THURSDAY;
			break;
		case 5:
			dayOfYheWeek = dayOfYheWeek.FRIDAY;
			break;
		case 6:
			dayOfYheWeek = dayOfYheWeek.SATURDAY;
			break;
		case 7:
			dayOfYheWeek = dayOfYheWeek.SUNDAY;
			break;
		default:
			return;
		}
	}

	public static int numberOfDaysBetween(Date date1, Date date2) {
		Calendar c1 = new GregorianCalendar();
		Calendar c2 = new GregorianCalendar();
		c1.set(date1.year.getIntYear(), date1.month.getIntMonth() - 1, date1.day.getIntDay());
		c2.set(date2.year.getIntYear(), date2.month.getIntMonth() - 1, date2.day.getIntDay());
		return Math.abs((int) (c1.getTimeInMillis() - c2.getTimeInMillis()) / (24 * 60 * 60 * 1000));
	}

	public boolean leapYear() {
		int year = this.year.getIntYear();
		if (year % 400 == 0) {
			return true;
		} else if (year % 100 == 0) {
			return false;
		} else if (year % 4 == 0) {
			return true;

		} else
			return false;
	}

	public class Year {

		private String strYear;
		private int intYear;

		private int getIntYear() {
			intYear = Integer.parseInt(getStrYear());
			return intYear;
		}

		private void setIntYear(int intYear) {
			this.intYear = intYear;
		}

		public String getStrYear() {
			return strYear;
		}

		private void setStrYear(String strYear) {
			this.strYear = strYear;
		}

	}

	public class Month {
		private String strMonth;
		private int intMonth;

		private int getIntMonth() {
			intMonth = Integer.parseInt(getStrMonth());
			return intMonth;
		}

		private void setIntMonth(int intMonth) {
			this.intMonth = intMonth;
		}

		public String getStrMonth() {
			return strMonth;
		}

		private void setStrMonth(String strMonth) {
			this.strMonth = strMonth;
		}

	}

	public class Day {
		private String strDay;
		private int intDay;

		private int getIntDay() {
			intDay = Integer.parseInt(getStrDay());
			return intDay;
		}

		private void setIntDay(int intDay) {
			this.intDay = intDay;
		}

		public String getStrDay() {
			return strDay;
		}

		private void setStrDay(String strDay) {
			this.strDay = strDay;
		}

	}
}
