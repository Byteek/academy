package by.academy.homework;

//Выводить на консоль степень двойки, пока результат не будет больше, чем 1_000_000. 

public class FourthTask {

	public static void main(String[] args) {

		double sum = 2;
		double degree = 2;
		for (int i = 0; sum < 1_000_000; i++) {
			sum = Math.pow(sum, degree);
			System.out.println(sum);
		}
	}
}
