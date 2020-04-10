package by.academy.homework;

import java.util.Scanner;

public class SixthTask {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String oneLine = scan.nextLine();
		String secondLine = scan.nextLine();

		if (oneLine.length() != secondLine.length()) {
			System.out.println(false);
			return;
		}

		int[] letters = new int[500];

		char[] s_array = oneLine.toCharArray();
		for (char c : s_array) {
			letters[c]++;
		}

		for (int i = 0; i < secondLine.length(); i++) {
			int c = (int) secondLine.charAt(i);
			if (--letters[c] < 0) {
				System.out.println(false);
				return;
			}
		}

		System.out.println(true);
		return;
	}

}
