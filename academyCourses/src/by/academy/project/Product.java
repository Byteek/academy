package by.academy.project;

public class Product {

	private double price;
	private String name = "Default name";
	private int quantity;
	public static int count = 0;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		count++;
	}

	public double cost() { // считает сумму товаров
		double sum = price * quantity;
		return sum;
	}

	public Product() {

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
		return "Product [name= " + name + ", price=" + price + ", quantity= " + quantity + "serial number= "  + count +"]";
	}

}
