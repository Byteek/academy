package by.academy.lesson9;

import java.util.Arrays;

public class MinMax<T extends Number> {

	private T [] t ;

	public MinMax() {

	}

	public MinMax(T[] t) {
		this.t = t;
	}

	public void min() {
		T min = t[0];
		for (int i = 0; i < t.length; i++) {
			if (t[i] < t[0]) {
				min = t[i];
			}
		}
	}

	public void max() {
		Arrays.sort(t);
		T max = t[t.length - 1];
		System.out.println(max);
	}

}

