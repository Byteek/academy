package by.academy.homework8;

import java.util.Random;
import java.util.concurrent.Semaphore;

public class Main {

	public static final int NUMBER_PORTS = 6;
	public static final int NUMBER_SHIPS = 12;

	public static boolean[] CONTROL_PORTS = null;

	public static Semaphore SEMAPHORE = null;

	public static void main(String[] args) {
		Random random = new Random();
		Port port1 = new Port(random.nextInt(1000));

		new Thread(new Ship(port1, random.nextInt(30))).start();
	}

}
