package by.academy.project;

public class Tomat extends Product {
	private String color;

	public Tomat(String name, double price, int quantity, String color) {
		super(name, price, quantity);
		this.color = color;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
