package by.academy.lesson13;

import java.util.Scanner;

//1. Создать программу, которая будет сообщать, 
//* является ли целое число, введенное пользователем, 
//* чётным или нечётным, простым или составным.  
//* Если пользователь введёт не целое число, то 
//* сообщать ему об ошибке.

public class FromNumberDemo {

	public static void main(String[] args) {
		int numbInt = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите целое число!");
		String number = scan.next();
		try {
			numbInt = Integer.parseInt(number);

		} catch (NumberFormatException e) {
			System.err.println("Вы ввели не целое число");
			return;
		}

		if (numbInt % 2 == 0) {
			System.out.println("Ваше число четное");
		} else {
			System.out.println("Число нечетное");
		}
		for (int i = 1; i <= numbInt; i++) {
			if (numbInt % i == 0) {
				count++;
			}
		}
		
		if (count == 2) {
			System.out.println("Число простое");
		} else {
			System.out.println("Число составное");
		}
	}

}
