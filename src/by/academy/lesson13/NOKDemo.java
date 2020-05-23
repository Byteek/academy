package by.academy.lesson13;

import java.util.ArrayList;
import java.util.Scanner;

public class NOKDemo {

	public static void main(String[] args) {

		ArrayList result1 = new ArrayList();
		ArrayList result2 = new ArrayList();

		ArrayList result3 = new ArrayList();
		ArrayList result4 = new ArrayList();

		int NOK = 0;
		int NOD = 0;
		int number1 = 0;
		int number2 = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Введите первое число");
		String numberOne = scan.next();
		System.out.println("Введите второе число");
		String numberSecond = scan.next();

		try {
			number1 = Integer.parseInt(numberOne);
			number2 = Integer.parseInt(numberSecond);

			for (int i = number1 * number2; i > number1; i--) {
				if (i % number1 == 0) {
					result1.add(i);
				}
			}
			for (int i = number2 * number1; i > number2; i--) {
				if (i % number2 == 0) {
					result2.add(i);
				}
			}

			result1.sort(null);
			result2.sort(null);

			for (int i = 0; i < result1.size(); i++) {
				for (int j = 0; j < result2.size(); j++) {
					if (result1.get(i) == result2.get(j)) {
						NOK = (int) result1.get(i);
						break;
					}
				}
			}

			System.out.println("НОК чисел " + number1 + " и " + number2 + " = " + NOK);

		} catch (NumberFormatException e) {
			System.err.println("Вы ввели нецелое число!");
		}

//		for (int i = 1; i < number1; i++) {
//			if (number1 % i == 0) {
//				result3.add(i);
//			}
//		}
//		for (int i = 1; i < number2; i++) {
//			if (number2 % i == 0) {
//				result4.add(i);
//			}
//		}
//
//		for (int i = 0; i < result3.size(); i++) {
//			for (int j = 0; j < result4.size(); j++) {
//				if (result3.get(i) == result4.get(j)) {
//					NOD = (int) result3.get(i);
//					break;
//				}
//			}
//		}
//		System.out.println("НОД чисел " + number1 + " и " + number2 + " = " + NOD);
	}

}
