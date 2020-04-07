package by.academy.homework;

import java.util.Scanner;

/*
 * 
 * Используем switch/case. Ввести с консоли тип данных(созраняем в String) и переменную, вывести на экран:
 *	a) если тип данных int, вывести остаток от деления на 2
 *	b) если double, вывести 70% от числа 
 *	c) если float, возвести в квадрат
 *	d) если char, вывести код символа
 *	e) String, вывести на экран строку в виде ("Hello " + переменная)
 *	f) во всех остальных случаях вывести на экран ("Unsupported type");
 *
 */

public class SecondTask {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Введите тип данных ");
		String type = scan.nextLine();
		System.out.print("Введите значение переменной ");
		String unknownValue = scan.nextLine();
		
		switch (type) {
			case "int": 
				int valueInt = Integer.parseInt(unknownValue);
				System.out.println("Остаток от деления " + valueInt + " на 2 = " + valueInt % 2);
		}
		
	}

}
