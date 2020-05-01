package by.academy.lesson9;

public class MainPrint {

	public static void main(String[] args) {

		Printable p = new Printable() {

			@Override
			public void print() {

				System.out.println("Print!");
			}

		};

		p.print();

	}

}

