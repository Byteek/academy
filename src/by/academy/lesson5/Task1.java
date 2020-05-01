package by.academy.lesson5;

import java.util.Arrays;
import java.util.Random;

public class Task1 {

	public static void main(String[] args) {
		int sum = 0;
		int[] arr = new int[10];
		Random random = new Random();
		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(10);
		}
		System.out.println();
		int maxValue = arr[0];
		int minValue = arr[0];

		for (int x : arr) {
			if (x > maxValue) {
				maxValue = x;
			}
		}
		for (int x : arr) {
			if (x < minValue) {
				minValue = x;
			}
		}
		for (int x : arr) {
			if (x == maxValue || x == minValue) {
				continue;
			}
			sum += x;
		}
		System.out.println("Массив чисел - " + Arrays.toString(arr));
		System.out.println("Максимальное значение = " + maxValue);
		System.out.println("Минимальное значение = " + minValue);
		System.out.println("Сумма всех элементов без максимального и минимального = " + sum);
	}

}
