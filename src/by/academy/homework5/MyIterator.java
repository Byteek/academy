package by.academy.homework5;

/*
 * Задание 3
 */

import java.util.Iterator;

public class MyIterator<T> implements Iterator<T> {

	private T simpleArray;
	private T[][] array;
	private int first, second;
	
	public MyIterator(T simpleArray) {
		this.simpleArray = simpleArray;
	}
	public MyIterator(T[][] array) {
		this.array = array;
	}

	@Override
	public boolean hasNext() {
		return first < array.length && second < array[first].length;
	}

	@Override
	public T next() {
		T item = array[first][second++];
		if (second >= array[first].length) {
			first++;
			second = 0;
		}
		return item;
	}
	

}
