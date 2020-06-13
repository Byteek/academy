package by.academy.homework8;

public class Port {

	private final int MAX_CONTAINERS = 1000;
	private int containers = 0;

	public Port(int containers) {
		this.containers = containers;
	}

	public void putContainers() {

		while (containers == getMAX_CONTAINERS()) {

		}

		containers++;
		System.out.println("Колличество контейнеров в порту  " + +containers);
		
	}

	public void getContainers() {
		while (containers < 1) {

		}

		containers--;
		System.out.println("Колличество контейнеров в порту " + containers);
	}

	public int getAllContaners() {
		return containers;
	}

	public int getMAX_CONTAINERS() {
		return MAX_CONTAINERS;
	}
}
