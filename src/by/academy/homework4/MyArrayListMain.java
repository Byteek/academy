package by.academy.homework4;

public class MyArrayListMain {

	public static void main(String[] args) {
		MyArrayList<String> test = new MyArrayList<String>();

		test.add("1");
		test.add("2");
		test.add("3");
		test.add("4");
		test.add("5");
		test.add("6");
		test.add("17");
		test.add("28");

		System.out.println(test.get(1)); // 2
		System.out.println(test.getLast()); // 28
		System.out.println(test.getFirst()); // 1
		System.out.println(test.sizeArray()); // 8
		System.out.println(test.getIndexLastItem()); // 8
		test.remove(2);
		test.remove(2);
		System.out.println(test.getIndexLastItem()); // 6
		test.remove("28");
		System.out.println(test.getIndexLastItem()); // 5

	}

}
