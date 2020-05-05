package by.academy.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int countProduct = 0;
		String textMenu = "1. Введите 1 чтобы добавить продукт		\r\n"
				+ "2. Введите 2 чтобы удалить продукт из сделки		\r\n"
				+ "3. Введите 3 для вывода сделки на экран 			\r\n"
				+ "4. Введите 4 для выхода из программы  			\r\n"
				+ "5. Введите 5 для добавления Покупателя 			\r\n"
				+ "6. Введите 6 для добавления Продавца 			\r\n" + "7. Введите 7 для совершения сделки";

		String numberIn = "";
		boolean yesOrNo = true;
		System.out.println("\t \t Добрый день! \r\n");
		Scanner scanner = new Scanner(System.in);


		while (yesOrNo) {
			System.out.println(textMenu);
			numberIn = scanner.nextLine();
			switch (numberIn) {
			case "1": {									 // 1. Введите 1 чтобы добавить продукт
				Product.plusProduct();
				break;
			}
			case "2": { 								// 2. Введите 2 чтобы удалить продукт из сделки
				listProduct.remove()
				break;
			}
			case "3": {									 // 3. Введите 3 для вывода на экран всех добавленных продуктов
				System.out.println("Все продукты : \r\n" + Product.allProductToString());
				break;
			}
			case "4": { 									// 4. Введите 4 для выхода из программы

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
			case "5": { 									// 5. Введите 5 для добавления Покупателя
				// code
			}
			case "6": { 									// 6. Введите 6 для добавления Продавца";
				// code
			}

			default: {
				continue;
			}
			}
		}
		scanner.close();
	}
}
