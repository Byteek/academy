package by.academy.homework8.ProducerConsumer;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {
	public static final int COUNT_CONTROL_DOCKS = 10;
	public static final int COUNT_SHIPS = 50;

	public static boolean[] CONTROL_PORTS = null;
	public static Semaphore SEMAPHORE = null;

	public static Random random;

	public static void main(String[] args) throws InterruptedException {
		random = new Random();
		Port port = new Port(random.nextInt(1000));

		CONTROL_PORTS = new boolean[COUNT_CONTROL_DOCKS];
		for (int i = 0; i < COUNT_CONTROL_DOCKS; i++) {
			CONTROL_PORTS[i] = true;
		}

		SEMAPHORE = new Semaphore(CONTROL_PORTS.length, true);
		System.out.println(port.getAllContaners());
		for (int i = 0; i < COUNT_SHIPS; i++) {
			new Thread(new Ship(port, random.nextInt(30), i)).start();
			Thread.sleep(random.nextInt(4000));
		}

	}

}
