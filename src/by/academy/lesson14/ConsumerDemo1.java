package by.academy.lesson14;

import java.util.function.Consumer;

//Написать лямбда выражение, которое принимает на вход объект типа HeavyBox и 
//выводит на консоль сообщение “Отгрузили ящик с весом n”. “Отправляем ящик с весом n” 
//Используем функциональный интерфейс Consumer и метод по умолчанию andThen.

public class ConsumerDemo1 {

	public static void main(String[] args) {

		Consumer<HeavyBox> box = hb -> {
			System.out.println("Отгрузили ящик с весом - " + hb.getNetto());
		};
		Consumer<HeavyBox> boxAndThen = hb -> {
			System.out.println("Отправляем ящик с весом - " + hb.getNetto());
		};

		HeavyBox boxic = new HeavyBox(75);
		box.accept(boxic);
		box.andThen(boxAndThen).accept(boxic);
	}

}
