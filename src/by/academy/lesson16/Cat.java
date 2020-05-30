package by.academy.lesson16;

public class Cat {

	public String name;
	private int numberLaps;
	protected int numberHvost;

	public Cat(String name, int numberLaps, int numberHvost) {
		super();
		this.name = name;
		this.numberLaps = numberLaps;
		this.numberHvost = numberHvost;
	}

	public String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	public int getNumberLaps() {
		return numberLaps;
	}

	protected void setNumberLaps(int numberLaps) {
		this.numberLaps = numberLaps;
	}

	protected int getNumberHvost() {
		return numberHvost;
	}

	private void setNumberHvost(int numberHvost) {
		this.numberHvost = numberHvost;
	}

}
