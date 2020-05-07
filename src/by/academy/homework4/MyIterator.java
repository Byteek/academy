package by.academy.homework4;

public class MyIterator<T> {

	private int index;
	private int ArrLength;
	private T[] array;

	public MyIterator(T [] array) {
		index = 0;
		this.ArrLength = array.length;
		this.array = array;
	}

	public boolean hasNext() {
		return index < ArrLength;
	}

	
	public T next() {
		if (index < ArrLength) {
			return array[index++];
		}
		System.out.println("Элементов больше нет(");
		return null;
	}
}
