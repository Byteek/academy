package by.academy.homework;

import java.util.Scanner;

//Ввести с консоли число от 1 до 10, 
//вывести на экран таблицу умножения для этого числа. (10 чисел).

public class ThirdTask {

	public static void main(String[] args) {
		int iNumber = 11;
		int number;
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("Введите число от 1 до 10");
			number = scan.nextInt();
			iNumber = number;
		} while (iNumber > 10);

		for (int i = 1; i <= 10; i++) {
			System.out.print(number * i + "  ");
		}
	}

}
