package by.academy.project;

public class Sirok extends Product {
	private int deadLine;

	

	public Sirok(String name, double price, int quantity, int deadLine) {
		super(name, price, quantity);
		this.deadLine = deadLine;
	}

	public int getDeadLine() {
		return deadLine;
	}

	public void setDeadLine(int deadLine) {
		this.deadLine = deadLine;
	}
}
