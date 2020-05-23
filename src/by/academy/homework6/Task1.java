package by.academy.homework6;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Task1 {

	public static void main(String[] args) throws IOException {
		
		//первый вериант
		// второй вариант будет такой, что строка будет не просто линией, а и с
		// переносами на другую строку
		Scanner scan = new Scanner(System.in);
		String line1 = scan.nextLine();
		File dir = new File("C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//");
		System.out.println(dir.mkdir());
		File fileFromWrite = new File(dir, "stopWord.txt");
		System.out.println(fileFromWrite.createNewFile());

		try (FileWriter writer = new FileWriter(fileFromWrite, false)) {
			String[] subStr = line1.split("stop");
			String subStr1 = subStr[0];
			writer.write(subStr1);
		}

	}

}
