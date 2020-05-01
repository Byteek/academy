package by.academy.homework2;

//Задание 7. Удаление пробелов. Дана строка, Вам требуется преобразовать все идущие подряд пробелы в один.
//Длина строки не превосходит 1000.
//Например: "Имеется        строка    с    текстом."
//Результат: "Имеется строка с текстом."

public class Task7 {

	public static void main(String[] args) {
		String test = "Имеется        строка    с    текстом.";

		if (test.length() > 1000) {
			System.out.println("Строка слишком большая!");
			return;
		}
		StringBuilder testBuilder = new StringBuilder();
		String[] testNew = test.split("\\s+");
		for (String i : testNew) {
			testBuilder.append(i + " ");
		}
		System.out.println("Было - " + test);
		System.out.println("Стало -  " + testBuilder.toString());

	}

}
