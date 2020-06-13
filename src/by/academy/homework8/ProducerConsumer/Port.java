package by.academy.homework8.ProducerConsumer;

import java.util.concurrent.atomic.AtomicInteger;

public class Port {

	private final int MAX_CONTAINERS = 1000;
	public static AtomicInteger containers;

	public Port(int containers) {
		this.containers = new AtomicInteger(containers);
	}

	public synchronized void putContainers() throws InterruptedException { // загрузка порта
		containers.getAndIncrement();
	}

	public synchronized void getContainers() throws InterruptedException { // разгрузка порта
		containers.getAndDecrement();
	}

	public synchronized int getAllContaners() {
		return containers.get();
	}

	public synchronized int getMAX_CONTAINERS() {
		return MAX_CONTAINERS;
	}
}
