package by.academy.homework8.ProducerConsumer;

import java.util.Random;

public class Ship implements Runnable {

	private int containers = 0;
	private final int MAX_CONTAINERS = 30;
	private Port port;
	private int freePlaseOnTheShip;
	private int count = 0;
	private int allContainersInPort;

	public Ship(Port port, int containers, int number) {
		this.port = port;
		this.containers = containers;
		freePlaseOnTheShip = MAX_CONTAINERS - containers;
		count = number;

	}

	@Override
	public void run() {
		boolean loadingOrUnloading = Main.random.nextBoolean();
		// true - разгружаем корабль
		// false - загружаем корабль

		if (loadingOrUnloading) { // разгрузка корабля
			try {
				Main.SEMAPHORE.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			int controlNum = -1;
			int controlNumPorts = -1;

			synchronized (Main.CONTROL_PORTS) {
				for (int i = 0; i < Main.COUNT_CONTROL_DOCKS; i++)
					if (Main.CONTROL_PORTS[i]) {

						Main.CONTROL_PORTS[i] = false;
						controlNum = i;
						System.out.println("Корабль " + (count + 1) + " зашел в порт " + (i + 1));
						controlNumPorts = i;
						break;
					}
			}

			if (port.getMAX_CONTAINERS() - port.getAllContaners() > containers) {

				System.out.println("Начал разгрузку корабля " + (count + 1));
				while (containers > 0) {
					containers--;
					try {
						port.putContainers();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Корбаль " + (count + 1) + " отдал контейнер, теперь на складе "
							+ port.getAllContaners() + " контейнеров");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else {

				System.out.println("Начал загрузку корабля " + (count + 1));
				while (containers < MAX_CONTAINERS) {
					containers++;
					try {
						port.getContainers();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Корбаль " + (count + 1) + " принял контейнер, теперь на складе "
							+ port.getAllContaners() + " контейнеров");

					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Корабль " + (count + 1) + " вышел из порта " + (controlNumPorts + 1));

			synchronized (Main.CONTROL_PORTS) {
				Main.CONTROL_PORTS[controlNum] = true;
			}
			Main.SEMAPHORE.release();
		}

		if (!loadingOrUnloading) { // загрузка корабля

			try {
				Main.SEMAPHORE.acquire();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			int controlNum = -1;
			int controlNumPorts = -1;

			synchronized (Main.CONTROL_PORTS) {
				for (int i = 0; i < Main.COUNT_CONTROL_DOCKS; i++)
					if (Main.CONTROL_PORTS[i]) {

						Main.CONTROL_PORTS[i] = false;
						controlNum = i;
						System.out.println("Корабль " + (count + 1) + " зашел в порт" + (i + 1));
						controlNumPorts = i;
						break;
					}
			}

			if (port.getAllContaners() > containers) {

				System.out.println("Начал загрузку корабля " + (count + 1));
				while (containers < MAX_CONTAINERS) {
					containers++;
					try {
						port.getContainers();
//						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println("Корбаль " + (count + 1) + " принял контейнер, теперь на складе "
							+ port.getAllContaners() + " контейнеров");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			} else {

				System.out.println("Начал разгрузку корабля " + (count + 1));
				while (containers > 0) {
					containers--;
					try {
						port.putContainers();
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}

					System.out.println("Корбаль " + (count + 1) + " отдал контейнер, теперь на складе "
							+ port.getAllContaners() + " контейнеров");
					try {
						Thread.sleep(2000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("Корабль " + (count + 1) + " вышел из порта" + (controlNumPorts + 1));

			synchronized (Main.CONTROL_PORTS) {
				Main.CONTROL_PORTS[controlNum] = true;
			}
			Main.SEMAPHORE.release();
		}
	}
}
