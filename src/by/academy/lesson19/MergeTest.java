package by.academy.lesson19;

import java.util.ArrayList;

public class MergeTest {

	public static void main(String[] args) {

		ArrayList<Integer> a = new ArrayList<Integer>();
		ArrayList<Integer> b = new ArrayList<Integer>();

		a.add(1);
		a.add(3);
		a.add(5);

		b.add(2);
		b.add(6);
		b.add(8);

		merge(a, b);

	}

	public static void merge(ArrayList<Integer> a, ArrayList<Integer> b) {
		Integer count1 = 0;
		Integer count2 = 0;

		a.addAll(b);
//		for (int i = 0; i < a.size(); i++) {
//			if(a.get(i) > )) {
//				
//			}
//		}
//		
		System.out.println(a);
		System.out.println(b);
	}

}
