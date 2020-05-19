package by.academy.project;

public class Smartphone extends Product {
	private final int guarantee = 1;

	public Smartphone(String name, double price, int quantity) {
		super(name, price, quantity);
	}

	private int getGuarantee() {
		return guarantee;
	}

}
