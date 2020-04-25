package by.academy.project;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int countProduct = 0;
		String textMenu = "1. Введите 1 чтобы добавить продукт \r\n"
				+ "2. Введите 2 чтобы удалить продукт из сделки\r\n" + "3. Введите 3 для вывода сделки на экран \r\n"
				+ "4. Введите 4 для выхода из программы  \r\n";

		String numberIn = "";
		boolean yesOrNo = true;
		Product[] allProduct = new Product[1000];
		System.out.println("\t \t Добрый день! \r\n");
		Scanner scanner = new Scanner(System.in);

		while (yesOrNo) {
			System.out.println(textMenu);
			numberIn = scanner.nextLine();
			switch (numberIn) {
			case "1": {
				Product.plusProduct();
				break;
			}
			case "2": {
				Product.minusProduct();
				break;
			}
			case "3": {
				System.out.println("Все продукты - " + Product.allProductToString());
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
}

//		Product kola = new Product("kola", 2.55, 5);
//		Product pepsi = new Product("pepsi", 2.55, 5);
//		Box<Product> myBox = new Box<>();
//		myBox.setItem(new Product[] { kola, pepsi });
//		System.out.println(myBox.getItem());
//		User buyer = new User("Volodya", 50.50);
//		User saler = new User("Magazin", 350.32);
//
//		Deal deal = new Deal(new Product[] { kola, pepsi }, buyer, saler);
//		System.out.println(deal.deal());
