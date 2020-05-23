package by.academy.lesson14;

import java.util.function.Supplier;

//Написать лямбда выражение, которое возвращает случайное число от 0 до 10. 
//Используем функциональный интерфейс Supplier.

public class SupplierDemo1 {

	public static void main(String[] args) {

		Supplier<Integer> random = () -> 0 + (int) (Math.random() * 10);

		System.out.println(random.get());
		

	}

}
