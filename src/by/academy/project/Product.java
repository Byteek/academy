package by.academy.project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class  Product {
	private double price;
	private String name = "Default name";
	private int quantity;

	public static int count = 0;
	public static int countArr = 0;

	public static List<Product> listProduct = new LinkedList();

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

	public static void  plusProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название продукта");
		String name = scanner.nextLine();
		System.out.println("Введите цену продукта " + name);
		double price = scanner.nextDouble();
		System.out.println("Введите количество продукта " + name);
		int quantity = scanner.nextInt();
		System.out.println("Вы добавили продукт " + name + count);
		listProduct.add(new Product(name, price, quantity));
	}

	public static void minusProduct() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите название продукта");
		String name = scanner.nextLine();

		for (Product i : listProduct) {
			if (i.name.equals(name)) {
				listProduct.remove(i);
			}
		}
	}

	public static List<Product> allProductToString() {

		return listProduct;
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
