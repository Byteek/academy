package by.academy.lesson14;

import java.util.function.Function;

//Написать лямбда выражение, которое принимает на вход число и возвращает значение 
//“Положительное число”, “Отрицательное число” или  “Ноль”.
//Используем функциональный интерфейс Function.

public class FunctionDemo1 {

	public static void main(String[] args) {

		Function<Integer, String> func = i -> {
			if (i > 0) {
				return "Больше нуля";
			} else if (i < 0) {
				return "Меньше нуля";
			} else {
				return "НОЛЬ!";
			}

		};

		System.out.println(func.apply(1));
		System.out.println(func.apply(0));
		System.out.println(func.apply(-2));

	}

}
