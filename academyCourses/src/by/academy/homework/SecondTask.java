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

		switch (type) {
		case "int":
			System.out.print("Введите значение переменной ");
			int valueInt = scan.nextInt();
			System.out.println("Остаток от деления " + valueInt + " на 2 = " + valueInt % 2);
			break;
		case "double":
			System.out.print("Введите значение переменной ");
			double valueDouble = scan.nextDouble();
			System.out.println("70% от числа " + valueDouble + " = " + (valueDouble * 0.70));
			break;
		case "float":
			System.out.print("Введите значение переменной ");
			float valueFloat = scan.nextFloat();
			System.out.println(valueFloat + " в квадрате = " + valueFloat * valueFloat);
			break;
		case "char":
			System.out.print("Введите значение переменной ");
			String unknownValue = scan.nextLine();
			char valueChar = unknownValue.charAt(unknownValue.length() - 1);
			System.out.println("Код символа = " + (int) valueChar);
			break;
		case "String":
			System.out.print("Введите значение переменной ");
			String valueString = scan.nextLine();
			System.out.println("Hello " + valueString);
			break;
		default:
			System.out.println("Unsupported type");
			break;
		}

	}

}
