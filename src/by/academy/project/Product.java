package by.academy.project;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {

	private double price;
	private String name = "Default name";
	private int quantity;

	public static int count = 0;
	public static int countArr = 0;

	public List<Product> listProduct = new ArrayList<Product>();

	public Product() {

	}

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		countArr++;

	}

	public double cost() { // считает сумму товаров
		double sum = price * quantity;
		return sum;
	}

	public static Product plusProduct() {
		try {
			String name;
			int smartOrAss;
			int quantity;
			double price;
			Scanner scanner = new Scanner(System.in);
			System.out.println("Выберите тип продукта");
			System.out.println("Введите 1, если это смартфон");
			System.out.println("Введите 2, если это аксессуар");
			smartOrAss = Integer.parseInt(scanner.nextLine());
			while (true)
				if (smartOrAss == 1) {
					System.out.println("Введите название смартфона");
					name = scanner.nextLine();
					System.out.println("Введите цену смартфона " + name);
					price = Double.parseDouble(scanner.nextLine());
					System.out.println("Введите количество смартфонов " + name);
					quantity = scanner.nextInt();
					System.out.println("Вы добавили смартфон(ы) " + name);
					return (new Smartphone(name, price, quantity));
				} else if (smartOrAss == 2) {
					System.out.println("Введите название аксессуара");
					name = scanner.nextLine();
					System.out.println("Введите цену аксессуара " + name);
					price = Double.parseDouble(scanner.nextLine());
					System.out.println("Введите количество аксессуаров " + name);
					quantity = scanner.nextInt();
					System.out.println("Вы добавили аксессуар(ы) " + name);
					return (new Accessories(name, price, quantity));
				} else {
					System.out.println("Пожалуйста, повторите еще раз!");
					return null;
				}
		} catch (NumberFormatException e) {
			System.err.println("Вы ввели неправильные данные");
			return null;
		}

	}

	public static Product plusUsersProduct() {
		String name;
		int smartOrAss;
		int quantity;
		double price = 0;
		double isPrice = 0;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Выберите тип продукта");
		System.out.println("Введите 1, если это смартфон");
		System.out.println("Введите 2, если это аксессуар");
		smartOrAss = Integer.parseInt(scanner.nextLine());
		if (smartOrAss == 1) {
			System.out.println("Введите название смартфона");
			name = scanner.nextLine();
			if (!DealProgramm.listShop.isEmpty()) {
				for (Product i : DealProgramm.listShop) {
					if (name.equals(i.name)) {
						isPrice = i.getPrice();
						break;
					}
				}

			}
			price = isPrice;

			System.out.println("Введите количество смартфонов " + name);
			quantity = scanner.nextInt();
			System.out.println("Вы добавили смартфон(ы) " + name);
			return (new Smartphone(name, price, quantity));
		} else if (smartOrAss == 2) {
			System.out.println("Введите название аксессуара");
			name = scanner.nextLine();
			if (!DealProgramm.listShop.isEmpty()) {
				for (Product i : DealProgramm.listShop) {
					if (name.equals(i.name)) {
						isPrice = i.getPrice();
						break;
					}
				}
			}
			price = isPrice;
			System.out.println("Введите количество аксессуаров " + name);
			quantity = scanner.nextInt();
			System.out.println("Вы добавили аксессуар(ы) " + name);
			return (new Accessories(name, price, quantity));
		} else {
			System.out.println("Пожалуйста, повторите еще раз!");
			return null;
		}

	}

//	public static Product plusUsersProduct() {
//		String name;
//		int smartOrAss;
//		int quantity;
//		double price = 0;
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Выберите тип продукта");
//		System.out.println("Введите 1, если это смартфон");
//		System.out.println("Введите 2, если это аксессуар");
//		smartOrAss = scanner.nextInt();
//		if (smartOrAss == 1) {
//			System.out.println("Введите название смартфона");
//			name = scanner.nextLine();
//			if (!DealProgramm.listShop.isEmpty()) {
//				for (Product i : DealProgramm.listShop) {
//					if (name.equals(i.name)) {
//						price = i.getPrice();
//					}
//				}
//			}
//			System.out.println("Введите количество смартфонов " + name);
//			quantity = scanner.nextInt();
//			System.out.println("Вы добавили смартфон(ы) " + name);
//			return (new Smartphone(name, price, quantity));
//		} else if (smartOrAss == 2) {
//			System.out.println("Введите название аксессуара");
//			name = scanner.nextLine();
//			if (!DealProgramm.listShop.isEmpty()) {
//				for (Product i : DealProgramm.listShop) {
//					if (name.equals(i.name)) {
//						price = i.getPrice();
//					}
//				}
//			}
//			System.out.println("Введите количество аксессуаров " + name);
//			quantity = scanner.nextInt();
//			System.out.println("Вы добавили аксессуар(ы) " + name);
//			return (new Accessories(name, price, quantity));
//		} else {
//			System.out.println("Пожалуйста, повторите еще раз!");
//		}
//
//		return null;
//
//	}

//	public static void minusProduct() {
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Введите название продукта");
//		String name = scanner.nextLine();
//
//		for (Product i : listProduct) {
//			if (i.name.equals(name)) {
//				listProduct.remove(i);
//			}
//		}
//	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Name= " + name + ", price= " + price + ", quantity= " + quantity;
	}

}
