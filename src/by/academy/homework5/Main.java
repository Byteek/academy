package by.academy.homework5;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

//		List<String> test = new ArrayList();
//		test.add("123123");
//		test.add("123");
//		test.add("123123");
//		test.add("222");
//		test.add("123123");
//		test.add("111");
//		System.out.println(test.toString());
//		Set<String> test2 = new HashSet(collectionReturnWithoutDuplicates(test));
//		System.out.println(test2.toString());

//		List array = new ArrayList();
//		List link = new LinkedList();
//
//		addAMillionItems(array);
//		addAMillionItems(link);
//
//		selectsAnItem(array);
//		selectsAnItem(link);

		
		// --------------------------------------------------------------------------//
		// Задание 3
		// --------------------------------------------------------------------------//
		
//		Integer[][] array = new Integer[][] { { 1 }, { 1, 2, 33, 45 }, { 2, 4, 2, 1, 2 } };
//		MyIterator i = new MyIterator(array);
//		while (i.hasNext()) {
//			System.out.print(i.next() + " ");
//		}

		// --------------------------------------------------------------------------//
		// Задание 4
		// --------------------------------------------------------------------------//

//		int k = 0, i = 0, current = 0;
//		ArrayList<Integer> list = new ArrayList<Integer>(createRandomeRatingList(10));
//		Iterator<Integer> iter = list.iterator();
//
//		System.out.println(list.toString());
//		while (iter.hasNext()) {
//			Iterator runner = iter;
//			while (runner.hasNext()) {
//				current = (int) runner.next();
//				if (i < current) {
//					i = current;
//				}
//			}
//		}
//		System.out.println("Самая большая оценка - " + i);

		// --------------------------------------------------------------------------//
		// Задание 5
		// --------------------------------------------------------------------------//

//		String text = "The try-with-resources statement is a try statement that declares one or more resources. "
//				+ "A resource is an object that must be closed after the program is finished with it. "
//				+ "The try-with-resources statement ensures that each resource is closed at the end of the statement. "
//				+ "Any object that implements java.lang.AutoCloseable, which includes all objects which implement java.io.Closeable, "
//				+ "can be used as a resource. ";
//		String test1 = "qwwwee";
//		int defaulValue = 1;
//		int value = defaulValue;
//		HashMap<Character, Integer> myMap = new HashMap();
//		char[] arr = test1.toCharArray();
//		for (char i : arr) {
//			if (myMap.containsKey(i)) {
//				myMap.put(i, myMap.get(i) + 1);
//			} else {
//				myMap.put(i, defaulValue);
//			}
//
//		}
//		System.out.println(myMap);

		// --------------------------------------------------------------------------//
		// Задание 6
		// --------------------------------------------------------------------------//

//		
//		int[] arrayInt = new int[8];
//		try {
//			for (int i = 0; i < 10; i++) {
//				arrayInt[i] = i;
//
//			}
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Array is to small, expand the array");
//		}

		
	}

	// --------------------------------------------------------------------------//
	// Задание 1
	// --------------------------------------------------------------------------//
	
	public static Collection<?> collectionReturnWithoutDuplicates(Collection<?> al) {
		Set<?> s = new LinkedHashSet<>(al);
		Collection<?> coll = new ArrayList<>(s);
		return coll;
	}

	// Задание 2
	public static void addAMillionItems(List<Integer> anyList) {
		for (int i = 0; i < 1_000_000; ++i) {
			anyList.add((int) (Math.random() * 100));
		}

	}

	public static void selectsAnItem(List<Integer> anyList) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < anyList.size(); ++i) {
			anyList.get((int) (Math.random() * 1_000_000));
		}
		long finish = System.currentTimeMillis();
		long allTime = finish - start;
		System.out.println("Время затраченное на выполение метода selectsAnItem()  =  " + allTime + " миллисекунд.");
	}

	public static List createRandomeRatingList(int numberOfStudents) {
		List<Integer> ratingList = new ArrayList<Integer>();
		for (int i = 0; i < numberOfStudents; i++) {
			ratingList.add((int) (Math.random() * 10));
		}
		return ratingList;

	}

	public static Integer searchLargeNumber(List list) {
		Iterator<Integer> iter = list.iterator();
		Integer current = iter.next();

		while (iter.hasNext()) {
			Integer runner = current;
			if (iter.next().equals(null)) {
				return current;
			} else if (iter.next() > current) {
				current = iter.next();
			}
			iter.next();
		}
		return current;
	}

}
