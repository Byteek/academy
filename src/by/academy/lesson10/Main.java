package by.academy.lesson10;

import java.util.LinkedList;
import java.util.List;

import by.academy.project.Product;

public class Main {
	public static void main(String[] args) {
		List<Product> arrayList = new LinkedList<>();

		System.out.println("Начальный размер arrayList: " + arrayList.size());
		arrayList.add(new Product("Колбаска", 34.55, 44));

		System.out.println("Размер arrayList после добавления: " + arrayList.size());
		System.out.println("Содержимое arrayList: " + arrayList);
		System.out.println(arrayList.get(0));

		arrayList.add(new Product("Сосиска", 13.55, 433));

		System.out.println("Размер arrayList после добавления: " + arrayList.size());
		System.out.println("Содержимое arrayList: " + arrayList);
		System.out.println(arrayList.get(1));
	}
}