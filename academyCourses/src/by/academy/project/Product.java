package by.academy.project;

import java.util.Scanner;

public class Product {

	private double price;
	private String name = "Default name";
	private int quantity;

	public static int count = 0;
	public static int countArr = 0;
	public static Product allProduct[] = new Product[5];

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

	public static void plusProduct() {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Введите название продукта");
		String name = scanner.nextLine();
		System.out.println("Введите цену продукта " + name);
		double price = scanner.nextDouble();
		System.out.println("Введите количество продукта " + name);
		int quantity = scanner.nextInt();
		allProduct[countArr] = new Product(name, price, quantity);
		System.out.println("Вы добавили продукт " + name + count);
		count++;

	}

	public static void minusProduct() {
		int i;
		int k;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название продукта");
		String name = scanner.nextLine();

		for (i = 0; i < allProduct.length; i++) { // поиск
			if (allProduct[i].name.equals(name)) {
				i = i;
				for (i = i; i < allProduct.length - 1; i++)
					allProduct[i] = allProduct[i + 1];
				for (k = i; k < allProduct.length - 1; k++) {
					allProduct[i] = allProduct[k + 1];
				}
				countArr--;
			}
		}

	}

	public static String allProductToString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < countArr; i++) {
			sb.append(allProduct[i].toString() + "\r\n");
		}
		return sb.toString();
	}

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
