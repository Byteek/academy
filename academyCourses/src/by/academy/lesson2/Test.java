package by.academy.lesson2;

public class Test {

	public static void main(String[] args) {
		int arr[] = new int [50];
		int count = 0;
		for (int i = 1; i < 100 ; i++ ) { //заполняем массив arr нечетными числами
			if(i % 2 !=0) {
				arr[count] = i;
				count++;
			}
		}
		for(int t : arr) {              //перебираем все элементы массива arr
			System.out.print(t + " "); //это в строчку выводим
		}
		for(int t : arr) {               //перебираем все элементы массива arr
			System.out.println(t + " "); //это в столбик
		}

	}

}
