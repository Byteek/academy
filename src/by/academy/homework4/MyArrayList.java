package by.academy.homework4;

import java.util.Iterator;

public class MyArrayList<T> {

	private final int DEFAULT_SIZE = 16;
	private final int DECREMENT_STEP = 4;
	private T[] array;
	private int item = 0;

	public MyArrayList() {
		array = (T[]) new Object[DEFAULT_SIZE];
	}

	public MyArrayList(int value) {
		array = (T[]) new Object[value];
	}

	/*
	 * Добавляет новый элемент в список. При достижении размера внутреннего массива
	 * происходит его увеличение в два раза.
	 */
	public void add(T obj) {
		if (item == array.length - 1)
			resize(array.length * 2); // увеличу в 2 раза, если достигли границ
		array[item++] = obj;
	}

	/*
	 * Возвращает элемент списка по индексу.
	 */
	public T get(int index) {
		return (T) array[index];
	}

	/*
	 * Возвращает последний элемент списка
	 */
	public T getLast() {
		return (T) array[sizeArray() - 1];
	}

	/*
	 * Возвращает первый элемент списка
	 */
	public T getFirst() {
		return (T) array[0];
	}

	/*
	 * Возвращает индекс последнего элемента в списке
	 */
	public int getIndexLastItem() {

		return item;
	}

	/*
	 * Удаляет элемент списка по индексу. Все элементы справа от удаляемого
	 * перемещаются на шаг налево. Если после удаления элемента количество элементов
	 * стало в DECREMENT_STEP раз меньше чем размер массива, то массив уменьшается в
	 * два раза.
	 */
	public void remove(int index) {
		for (int i = index; i < item; i++) {
			array[i] = array[i + 1];
		}
		array[item] = null;
		item--;

		if (array.length > DEFAULT_SIZE && item < array.length / DECREMENT_STEP)
			resize(array.length / 2);
	}

	/*
	 * Удаляет элемент списка по значению объекта
	 */
	public void remove(T obj) {
		for (int i = 0; i < sizeArray(); i++) {
			if (array[i].equals(obj)) {
				array[i] = array[i + 1];
			}
		}
		array[sizeArray()] = null;
		item--;

		if (array.length > DEFAULT_SIZE && item < array.length / DECREMENT_STEP)
			resize(array.length / 2);
	}

	/*
	 * Возвращает количество элементов в списке
	 */
	
	public int sizeArray() {
		return item;
	}

	/*
	 * Метод для расширения/сужения массива
	 */
	private void resize(int value) {
		Object[] newArray = new Object[value];
		System.arraycopy(array, 0, newArray, 0, item);
		array = (T[]) newArray;
	}

}
