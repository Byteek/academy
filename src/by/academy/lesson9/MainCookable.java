package by.academy.lesson9;

public class MainCookable {

	public static void main(String[] args) {
		Food food = new Food();
		Cookable c = new Cookable() {

			public void cook(String str) {
				System.out.println("Мы приготовили " + str);

			}

		};

		food.prepare(c, "оладушки");

	}

}

