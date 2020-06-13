package by.academy.homework8;

public class Ship implements Runnable {

	private int containers = 0;
	private final int MAX_CONTAINERS = 30;
	private Port port;

	public Ship(Port port, int containers) {
		this.port = port;
		this.containers = containers;
	}

	@Override
	public void run() {
		while (port.getAllContaners() < port.getMAX_CONTAINERS()) {
			port.putContainers();
		}
		while (port.getAllContaners() == port.getMAX_CONTAINERS()) {
			port.getContainers();
		}

	}

}
