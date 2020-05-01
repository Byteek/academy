package by.academy.homework;

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

//Дан массив с int переменными, 
//определить количество пар, 
//разность которых эквивалентна 
//заданному с консоли target значению. 

public class FifthTask {

	static int pairs(int k, int[] arr) {
		int pairsCount = 0;
		for (int i : arr) {
			for (int y : arr) {
				if ((i - y) == Math.abs(k)) {
					pairsCount++;
				}
			}
		}
		return pairsCount;
	}

	private static final Scanner scanner = new Scanner(System.in);

	// Complete the pairs function below.

	public static void main(String[] args) throws IOException {

		String[] nk = scanner.nextLine().split(" ");

		int n = Integer.parseInt(nk[0]);

		int k = Integer.parseInt(nk[1]);

		int[] arr = new int[n];

		String[] arrItems = scanner.nextLine().split(" ");

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(arrItems[i]);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		int result = pairs(k, arr);
		System.out.println(result);

		scanner.close();
	}

}
