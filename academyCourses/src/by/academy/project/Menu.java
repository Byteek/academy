package by.academy.project;

import java.util.Scanner;

public class Menu {
	int countProduct = 0;
	String textMenu = "1. Введите 1 чтобы добавить продукт \r\n" + "2. Введите 2 чтобы удалить продукт из сделки\r\n"
			+ "3. Введите 3 для вывода сделки на экран \r\n" + "4. Введите 4 для выхода из программы  \r\n";

	String numberIn = "";
	boolean yesOrNo = true;
	Product[] allProduct = new Product[1000];System.out.println("\t \t Добрый день! \r\n");
	Scanner scanner = new Scanner(System.in);

	while(!"0".equals(numberIn))
	{
		System.out.println(textMenu);
		numberIn = scanner.nextLine();
		switch (numberIn) {
		case "1": {
			System.out.println("Введите название продукта");
			String name = scanner.nextLine();
			System.out.println("Введите цену продукта " + name);
			double price = scanner.nextDouble();
			System.out.println("Введите количество продукта " + name);
			int quantity = scanner.nextInt();
			allProduct[countProduct] = new Product(name, price, quantity);
			System.out.println("Вы добавили продукт " + name + countProduct);
			countProduct++;
			break;
		}
		case "2": {
			System.out.println("Введите название продукта который подлежит удалению");
			String nameDelete = scanner.nextLine();

			countProduct--;
			System.out.println("Вы удалили продукт");
			break;
		}
		case "3": {
			for (int i = 0; i < countProduct; i++) {
				System.out.println(allProduct[i].toString());
			}
			System.out.println("Ваша сделка - ");
			break;
		}
		case "4": {
			System.out.println("Вы точно хотите выйти? y/n");

			switch (scanner.nextLine()) {
			case "y": {
				return;
			}
			case "n": {
				continue;
			}
			}
			break;
		}
		default: {
			continue;
		}
		}
	}
}