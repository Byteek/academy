package by.academy.homework6;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Task2 {

	public static void main(String[] args) throws IOException {
		String textFile;
		StringBuilder sb = new StringBuilder();
		try (BufferedReader reader = new BufferedReader(new FileReader(
				"C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//FirstFile.txt"));) {
			textFile = reader.readLine();
		}

		String[] textArr = textFile.split("\\s");

		for (int i = 0; i < textArr.length; i++) {
			sb.append(textArr[i]);
		}
		File file2 = new File("C://Users//bytee//eclipse-workspace//academyCourses//src//by//academy//homework6//",
				"result.txt");
		file2.createNewFile();
		try (BufferedWriter writer = new BufferedWriter(new FileWriter(file2));) {
			writer.write(sb.toString());
		}

		
		
	}

}
