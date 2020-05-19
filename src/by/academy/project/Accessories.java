package by.academy.project;

public class Accessories extends Product {
	private String material;

	public Accessories(String name, double price, int quantity) {
		super(name, price, quantity);

	}

	private String getMaterial() {
		return material;
	}

	private void setMaterial(String material) {
		this.material = material;
	}

}
