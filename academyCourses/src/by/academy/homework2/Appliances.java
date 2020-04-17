package by.academy.homework2;

//Задание 3. Создать иерархию классов, описывающих бытовую технику. Создать
//несколько объектов описанных классов, часть из них включить в розетку.
//Иерархия должна иметь хотя бы три уровня. 

abstract class Appliances {
	private boolean jack = true;
	private int size;
	private String color;

	public String powerOn() {
		return "";
	}

	public boolean getJack() {
		return jack;
	}

	public void setJack(boolean jack) {
		this.jack = jack;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String toString() {
		return "Техника " + color + " цвета, объемом - " + size + " сантиметров кубических";
	}
}
