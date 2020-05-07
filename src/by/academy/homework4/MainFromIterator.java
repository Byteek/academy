package by.academy.homework4;

public class MainFromIterator {

	public static void main(String[] args) {
		String[] arrayStr = new String[] {"Sunday", "Monday", "Tuesday",
			  "Wednesday", "Thirsday", "Friday", "Saturday"};
		
		MyIterator<String> it = new MyIterator(arrayStr);
		System.out.println("Day of week: ");
		if(it.hasNext()) {
			for (int i = 0; i <arrayStr.length; i++ ) {
				System.out.print(it.next() + " ");
			}
		}

	}

}
