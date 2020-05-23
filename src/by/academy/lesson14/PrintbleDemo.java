package by.academy.lesson14;

public class PrintbleDemo {

	public static void main(String[] args) {
		Printble test = () -> System.out.println("Print");
		test.print();
		Printble staticPrint = Printble::printStatic;
		staticPrint.print();
	}

}
