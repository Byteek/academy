package by.academy.lesson19;

public class DeadlockTest {

	public static void main(String[] args) throws InterruptedException {
		String res1 = "123";
		String res2 = "321";

		System.out.println("Main - started");

		Thread t1 = new Thread("t1") {
			public void run() {
				System.out.println(getName() + " - started");
				synchronized (res1) {
					System.out.println("Thread1 locked res1");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(getName() + " - end");

					synchronized (res2) {
						System.out.println("Thread1 locked res2");
						System.out.println(res2 + res2);
						System.out.println(getName() + " - end");
					}
				}

			}
		};

		Thread t2 = new Thread("t2") {
			public void run() {
				System.out.println(getName() + " - started");
				synchronized (res2) {
					System.out.println("Thread2 locked res2");
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					System.out.println(res2 + res2);
					System.out.println(getName() + " - end");

					synchronized (res1) {
						System.out.println("Thread2 locked res1");
						System.out.println(res1 + res1);
						System.out.println(getName() + " - end");
					}
				}

			}
		};

		t1.start();
		t2.start();

		System.out.println("Main - end");

	}

}
