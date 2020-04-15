package by.academy.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task3 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		int[] arrMax = new int[arr.length];
		int index = 0;
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
		}
		int cout = arrMax[0];
		for (int i = 0; i < arr.length; i++) {
			arrMax[arr[i]]++;
		}
		for (int i = 0; i < arrMax.length; i++) {
			if (arrMax[i] > cout) {
				index = i;
				cout = arrMax[i];
				
			}
		}
		System.out.println("Массив" + Arrays.toString(arr));
		System.out.println("Количество повторений - " + cout);
		System.out.println("Число - " + index);
	}
}
